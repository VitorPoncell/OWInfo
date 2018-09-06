package com.poturno.vitor.owinfo.activity.heroesList;

import android.graphics.Bitmap;
import android.util.Log;

import com.poturno.vitor.owinfo.downloader.IDownloaderListener;
import com.poturno.vitor.owinfo.downloader.IImgDownloaderListener;
import com.poturno.vitor.owinfo.downloader.ImgDownloader;
import com.poturno.vitor.owinfo.downloader.JsonDownloader;
import com.poturno.vitor.owinfo.helper.IIterator;
import com.poturno.vitor.owinfo.helper.IIteratorListener;
import com.poturno.vitor.owinfo.helper.KeyWords;
import com.poturno.vitor.owinfo.helper.Url;
import com.poturno.vitor.owinfo.model.Hero;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class HeroesListIterator implements IIterator, IDownloaderListener {

    private IIteratorListener listener;

    private Hero[] heroes;

    private int index = 0;

    private int size = 0;


    public HeroesListIterator(IIteratorListener listener) {
        this.listener = listener;
        new JsonDownloader(this, Url.HEROES_LIST).execute();
    }

    @Override
    public void onJsonRecived(String json) {
        Log.i("Flag", "json recived");
        try {
            size = new JSONObject(json).getInt("total");
            heroes = new Hero[size];
        } catch (JSONException e) {
            e.printStackTrace();
        }
        heroes = jsonToArrayList(json).toArray(heroes);
        listener.ready();
    }


    @Override
    public boolean hasNext() {
        return index < size;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return heroes[index++];
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




    private ArrayList<Hero> jsonToArrayList(String json) {
        ArrayList<Hero> heroes = new ArrayList<Hero>();
        try {

            JSONObject jsonObject = new JSONObject(json);
            JSONArray array = jsonObject.getJSONArray(KeyWords.DATA);
            for (int i = 0; i < array.length(); i++) {
                String heroJson = array.get(i).toString();
                heroes.add(jsonToHero(heroJson));
            }
        } catch (Exception e) {

        }

        return heroes;
    }

    private Hero jsonToHero(String json) {
        Hero hero = new Hero();
        try {
            JSONObject jsonObject = new JSONObject(json);
            hero.setId("" + jsonObject.getInt(KeyWords.ID));
            hero.setName(jsonObject.getString(KeyWords.NAME));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hero;
    }

}
