package com.poturno.vitor.owinfo.activity.heroesList;

import android.content.Context;
import android.util.Log;

import com.poturno.vitor.owinfo.helper.KeyWords;
import com.poturno.vitor.owinfo.model.Hero;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

public class HeroesListPresenter implements IHeroesListPresenter {
    private HeroesListActivity activity;

    public HeroesListPresenter(HeroesListActivity activity){
        this.activity = activity;
    }

    @Override
    public void getHeroesList(){
        new DownloadHeroesList(this).execute();

    }

    public void showHeroes(String json){
        ArrayList<Hero> heroes = jsonToArrayList(json);
        Iterator iterator = heroes.iterator();
        while (iterator.hasNext()){
            activity.printHero((Hero)iterator.next());
        }
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
            hero.setId(jsonObject.getInt(KeyWords.ID));
            hero.setName(jsonObject.getString(KeyWords.NAME));
            hero.setDescription(jsonObject.getString(KeyWords.DESCRIPTION));
            hero.setHealth(jsonObject.getInt(KeyWords.HEALTH));
            hero.setArmour(jsonObject.getInt(KeyWords.ARMOUR));
            hero.setRealName(jsonObject.getString(KeyWords.REAL_NAME));
            hero.setAge(jsonObject.getInt(KeyWords.AGE));
            hero.setHeight(jsonObject.getInt(KeyWords.HEIGHT));
            hero.setAffiliation(jsonObject.getString(KeyWords.AFFILIATION));
            hero.setBaseOfOperations(jsonObject.getString(KeyWords.BASE_OF_OPERATIONS));
            hero.setDifficulty(jsonObject.getInt(KeyWords.DIFFICULTY));
            hero.setUrl(jsonObject.getString(KeyWords.URL));
        }catch (Exception e){
            e.printStackTrace();
        }
        return hero;
    }
}
