package com.poturno.vitor.owinfo.activity.brawl;

import android.util.Log;

import com.poturno.vitor.owinfo.downloader.IDownloaderListener;
import com.poturno.vitor.owinfo.downloader.JsonDownloader;
import com.poturno.vitor.owinfo.helper.IIterator;
import com.poturno.vitor.owinfo.helper.IIteratorListener;
import com.poturno.vitor.owinfo.helper.KeyWords;
import com.poturno.vitor.owinfo.helper.Url;
import com.poturno.vitor.owinfo.model.Brawl;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BrawlIterator implements IIterator, IDownloaderListener {

    private IIteratorListener listener;

    private Brawl[] brawls;

    private int index = 0;

    private int size = 0;

    public BrawlIterator(IIteratorListener listener) {
        this.listener = listener;
        new JsonDownloader(this, Url.BRAWL).execute();

    }

    @Override
    public void onJsonRecived(String json) {
        Log.i("Flag", "json recived");
        try {
            size = new JSONObject(json).getInt("total");
            brawls = new Brawl[size];
        } catch (JSONException e) {
            e.printStackTrace();
        }
        jsonToArray(json);
        listener.ready();
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return brawls[index++];
        } else {
            return null;
        }
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void jsonToArray(String json) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray array = jsonObject.getJSONArray(KeyWords.DATA);
            for (int i = 0; i < size; i++) {
                brawls[i] = jsonToBrawl(array.get(i).toString());
            }
        } catch (Exception e) {

        }
    }

    private Brawl jsonToBrawl(String json) {
        Brawl brawl = new Brawl();
        try {
            JSONObject jsonObject = new JSONObject(json);
            brawl.setId("" + jsonObject.getInt(KeyWords.ID));
            brawl.setName(jsonObject.getString(KeyWords.NAME));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return brawl;
    }
}
