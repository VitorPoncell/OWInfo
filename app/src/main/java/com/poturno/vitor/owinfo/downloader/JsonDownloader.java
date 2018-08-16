package com.poturno.vitor.owinfo.downloader;

import android.os.AsyncTask;
import android.util.Log;

import com.poturno.vitor.owinfo.helper.Url;
import com.poturno.vitor.owinfo.helper.Util;

import java.io.InputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class JsonDownloader extends AsyncTask<Void,Void,String> {


    private IDownloaderListener listener;
    private String urlValue;


    public JsonDownloader(IDownloaderListener listener, String url){
        Log.i("Flag","downloader");
        this.listener = listener;
        this.urlValue = url;
    }

    @Override
    protected String doInBackground(Void... voids) {
        Log.i("Flag","downloading");
        String value = "";
        HttpsURLConnection urlConnection;
        try{
            URL url = new URL(urlValue);
            urlConnection = (HttpsURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            InputStream inputStream;

            if(urlConnection.getResponseCode() < HttpsURLConnection.HTTP_BAD_REQUEST){
                inputStream = urlConnection.getInputStream();
            }else{
                inputStream = urlConnection.getErrorStream();
            }

            value = Util.convertInputStreamToString(inputStream);
            inputStream.close();
            urlConnection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    protected void onPostExecute(String s) {
        Log.i("Flag","post download");

        listener.onJsonRecived(s);
        super.onPostExecute(s);
    }
}
