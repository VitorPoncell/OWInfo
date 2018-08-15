package com.poturno.vitor.owinfo.activity.heroesList;

import android.os.AsyncTask;
import android.util.Log;

import com.poturno.vitor.owinfo.helper.Convert;
import com.poturno.vitor.owinfo.helper.Url;

import java.io.InputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class DownloadHeroesList extends AsyncTask<Void,Void,String> {

    private HeroesListPresenter presenter;

    public DownloadHeroesList(HeroesListPresenter presenter){
        this.presenter = presenter;
    }

    @Override
    protected String doInBackground(Void... params) {

        String value = "";
        HttpsURLConnection urlConnection;
        try{
            URL url = new URL(Url.HEROES_LIST);
            urlConnection = (HttpsURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            InputStream inputStream;

            if(urlConnection.getResponseCode() < HttpsURLConnection.HTTP_BAD_REQUEST){
                inputStream = urlConnection.getInputStream();
            }else{
                inputStream = urlConnection.getErrorStream();
            }

            value = Convert.inputStreeamToString(inputStream);
            inputStream.close();
            urlConnection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
        presenter.showHeroes(value);
        return value;
    }
}
