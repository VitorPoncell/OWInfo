package com.poturno.vitor.owinfo.activity.gameMode;

import android.util.Log;

import com.poturno.vitor.owinfo.downloader.IDownloaderListener;
import com.poturno.vitor.owinfo.downloader.JsonDownloader;
import com.poturno.vitor.owinfo.helper.IIterator;
import com.poturno.vitor.owinfo.helper.IIteratorListener;
import com.poturno.vitor.owinfo.helper.KeyWords;
import com.poturno.vitor.owinfo.helper.Url;
import com.poturno.vitor.owinfo.model.GameMode;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class GameModeIterator implements IIterator, IDownloaderListener {

    private IIteratorListener listener;

    private GameMode[] gameModes;

    private int index = 0;

    private int size = 0;

    public GameModeIterator(IIteratorListener listener) {
        this.listener = listener;
        new JsonDownloader(this, Url.GAME_MODE).execute();

    }

    @Override
    public void onJsonRecived(String json) {
        Log.i("Flag", "json recived");
        try {
            size = new JSONObject(json).getInt("total");
            gameModes = new GameMode[size];
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
        if(hasNext()){
            return gameModes[index++];
        }else{
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
                gameModes[i] = jsonToGameMode(array.get(i).toString());
            }
        } catch (Exception e) {

        }
    }

    private GameMode jsonToGameMode(String json) {
        GameMode gameMode = new GameMode();
        try {
            JSONObject jsonObject = new JSONObject(json);
            gameMode.setId("" + jsonObject.getInt(KeyWords.ID));
            gameMode.setName(jsonObject.getString(KeyWords.NAME));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gameMode;
    }
}
