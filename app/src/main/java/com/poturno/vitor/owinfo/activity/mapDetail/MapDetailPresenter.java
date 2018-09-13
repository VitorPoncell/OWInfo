package com.poturno.vitor.owinfo.activity.mapDetail;

import android.graphics.Bitmap;

import com.poturno.vitor.owinfo.downloader.IDownloaderListener;
import com.poturno.vitor.owinfo.downloader.IImgDownloaderListener;
import com.poturno.vitor.owinfo.downloader.ImgDownloader;
import com.poturno.vitor.owinfo.downloader.JsonDownloader;
import com.poturno.vitor.owinfo.helper.KeyWords;
import com.poturno.vitor.owinfo.helper.Url;
import com.poturno.vitor.owinfo.model.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class MapDetailPresenter implements IMapDetailPresenter, IDownloaderListener, IImgDownloaderListener {

    private MapDetailActivity activity;

    public MapDetailPresenter(MapDetailActivity activity){
        this.activity = activity;
    }

    @Override
    public void getMapDetail(String id){
        activity.waitOperation();
        new JsonDownloader(this, Url.mapDetail(id)).execute();
        new ImgDownloader(id,Url.getMapImgDetail(id),this).execute();

    }

    private Map jsonToMapDetail(String json){
        Map map = new Map();
        try{
            JSONObject jsonObject = new JSONObject(json);
            map.setId(""+jsonObject.getInt(KeyWords.ID));
            map.setName(jsonObject.getString(KeyWords.NAME));
            map.setLocation(jsonObject.getString(KeyWords.LOCATION));
            JSONObject mode = (JSONObject) jsonObject.get(KeyWords.MODE);
            map.setMode(mode.getString(KeyWords.NAME));
            JSONObject event = (JSONObject) jsonObject.get(KeyWords.EVENT);
            map.setEvent(event.getString(KeyWords.NAME));
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    @Override
    public void onJsonRecived(String json) {
        activity.printMapDetail(jsonToMapDetail(json));
    }

    @Override
    public void onBitmapRecived(Bitmap bitmap, String id) {
        activity.stopWait();
        activity.printImage(bitmap);
    }
}
