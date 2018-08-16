package com.poturno.vitor.owinfo.activity.heroesList;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.poturno.vitor.owinfo.downloader.IDownloaderListener;
import com.poturno.vitor.owinfo.downloader.JsonDownloader;
import com.poturno.vitor.owinfo.helper.KeyWords;
import com.poturno.vitor.owinfo.helper.Url;
import com.poturno.vitor.owinfo.model.Hero;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

public class HeroesListPresenter implements IHeroesListPresenter, IDownloaderListener{
    private HeroesListActivity activity;

    public HeroesListPresenter(HeroesListActivity activity){
        this.activity = activity;
    }

    @Override
    public void getHeroesList(){
        new JsonDownloader(this, Url.HEROES_LIST).execute();
    }

    private ArrayList<Hero> jsonToArrayList(String json){
        ArrayList<Hero> heroes = new ArrayList<Hero>();
        try {

            JSONObject jsonObject = new JSONObject(json);
            JSONArray array = jsonObject.getJSONArray(KeyWords.DATA);
            for(int i = 0; i < array.length();i++){
                String heroJson =  array.get(i).toString();
                heroes.add(jsonToHero(heroJson));
            }
        }catch (Exception e){

        }

        return heroes;
    }
    private Hero jsonToHero(String json){
        Hero hero = new Hero();
        try {
            JSONObject jsonObject = new JSONObject(json);
            hero.setId(""+jsonObject.getInt(KeyWords.ID));
            hero.setName(jsonObject.getString(KeyWords.NAME));
        }catch (Exception e){
            e.printStackTrace();
        }
        return hero;
    }

    @Override
    public void onJsonRecived(final String json) {
        Log.i("Flag","recived");

        ArrayList<Hero> heroes = jsonToArrayList(json);
        Iterator<Hero> iterator = heroes.iterator();
        while(iterator.hasNext()){
            activity.printHero(iterator.next());
        }
    }
}
