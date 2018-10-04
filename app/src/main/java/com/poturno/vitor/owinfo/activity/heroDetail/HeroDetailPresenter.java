package com.poturno.vitor.owinfo.activity.heroDetail;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;

import com.poturno.vitor.owinfo.downloader.IDownloaderListener;
import com.poturno.vitor.owinfo.downloader.IImgDownloaderListener;
import com.poturno.vitor.owinfo.downloader.ImgDownloader;
import com.poturno.vitor.owinfo.downloader.JsonDownloader;
import com.poturno.vitor.owinfo.helper.KeyWords;
import com.poturno.vitor.owinfo.helper.Url;
import com.poturno.vitor.owinfo.model.Ability;
import com.poturno.vitor.owinfo.model.Hero;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class HeroDetailPresenter implements IHeroDetailPresenter, IDownloaderListener, IImgDownloaderListener{
    private HeroDetailActivity activity;

    public HeroDetailPresenter(HeroDetailActivity heroDetailActivity) {
        this.activity = heroDetailActivity;

    }

    @Override
    public void getHeroDetail(String id) {
        new JsonDownloader(this, Url.heroDetail(id)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
        new ImgDownloader(""+id,Url.getBigHeroImg(""+id),this).execute();

    }

    private Hero jsonToHeroDetail(String json){
        Hero hero = new Hero();
        try {
            JSONObject jsonObject = new JSONObject(json);
            hero.setId(""+jsonObject.getInt(KeyWords.ID));
            hero.setName(jsonObject.getString(KeyWords.NAME));
            hero.setDescription(jsonObject.getString(KeyWords.DESCRIPTION));
            hero.setHealth(""+jsonObject.getInt(KeyWords.HEALTH));
            hero.setArmour(""+(jsonObject.getInt(KeyWords.ARMOUR)+jsonObject.getInt(KeyWords.SHIELD)));
            hero.setRealName(verifyNull(jsonObject.getString(KeyWords.REAL_NAME)));
            hero.setAge(""+verifyNull(""+jsonObject.get(KeyWords.AGE)));
            hero.setHeight(""+verifyNull(jsonObject.get(KeyWords.HEIGHT)));
            hero.setAffiliation(verifyNull(jsonObject.get(KeyWords.AFFILIATION)));
            hero.setBaseOfOperations(verifyNull(jsonObject.getString(KeyWords.BASE_OF_OPERATIONS)));
            hero.setDifficulty(""+jsonObject.get(KeyWords.DIFFICULTY));
            hero.setUrl(jsonObject.getString(KeyWords.URL));
            hero.setRole(jsonObject.getJSONObject(KeyWords.ROLE).getString(KeyWords.NAME));
            ArrayList<String> subRoles = new ArrayList<String>();
            JSONArray array = jsonObject.getJSONArray(KeyWords.SUB_ROLE);
            for(int i = 0;i<array.length();i++){
                subRoles.add(array.getJSONObject(i).getString(KeyWords.NAME));
            }
            hero.setSubRoles(subRoles);
            ArrayList<Ability> abilities = new ArrayList<Ability>();
            array = jsonObject.getJSONArray(KeyWords.ABILITIES);
            for(int i = 0;i<array.length();i++){
                Ability ability = new Ability();
                ability.setId(array.getJSONObject(i).getInt(KeyWords.ID));
                ability.setName(array.getJSONObject(i).getString(KeyWords.NAME));
                ability.setDescription(array.getJSONObject(i).getString(KeyWords.DESCRIPTION));
                ability.setUltimate(array.getJSONObject(i).getBoolean(KeyWords.IS_ULTIMATE));
                abilities.add(ability);
            }
            hero.setAbilities(abilities);

        }catch (Exception e){
            e.printStackTrace();
        }
        return hero;
    }

    private String verifyNull(Object num){
        if(num.toString().equals("null")){
            return "Not informed";
        }else{
            return  num.toString();
        }

    }

    @Override
    public void onJsonRecived(String json) {
        activity.printHeroDetail(jsonToHeroDetail(json));

    }

    @Override
    public void onBitmapRecived(Bitmap bitmap, String id) {
        activity.printHeroImg(bitmap);
    }
}
