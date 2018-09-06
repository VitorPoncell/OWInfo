package com.poturno.vitor.owinfo.activity.mapsList;

import com.poturno.vitor.owinfo.downloader.IDownloaderListener;
import com.poturno.vitor.owinfo.downloader.JsonDownloader;
import com.poturno.vitor.owinfo.helper.IIterator;
import com.poturno.vitor.owinfo.helper.IIteratorListener;
import com.poturno.vitor.owinfo.helper.KeyWords;
import com.poturno.vitor.owinfo.helper.Url;
import com.poturno.vitor.owinfo.model.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MapsListIteractor implements IIterator, IDownloaderListener {

    private IIteratorListener listener;
    private Map[] maps;
    private int index = 0;
    private int size = 0;

    public MapsListIteractor(IIteratorListener listener) {
        this.listener = listener;
        new JsonDownloader(this, Url.MAPS_LIST).execute();
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

    @Override
    public Object next() {
        if(hasNext()){
            return maps[index++];
        }
        return null;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void onJsonRecived(String json) {
        try {
            maps = new Map[new JSONObject(json).getInt("total")];
            size = maps.length;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        maps = jsonToArrayList(json).toArray(maps);
        listener.ready();

    }

    private ArrayList<Map> jsonToArrayList(String json) {
        ArrayList<Map> maps = new ArrayList<Map>();
        try {

            JSONObject jsonObject = new JSONObject(json);
            JSONArray array = jsonObject.getJSONArray(KeyWords.DATA);
            for (int i = 0; i < array.length(); i++) {
                String mapJson = array.get(i).toString();
                maps.add(jsonToMap(mapJson));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return maps;
    }

    private Map jsonToMap(String json) {
        Map map = new Map();
        try {
            JSONObject jsonObject = new JSONObject(json);
            map.setId("" + jsonObject.getInt(KeyWords.ID));
            map.setName(jsonObject.getString(KeyWords.NAME));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
