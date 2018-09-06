package com.poturno.vitor.owinfo.downloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import java.io.InputStream;
import java.net.URL;

public class ImgDownloader extends AsyncTask<Void, Void, Bitmap> {

    private String id;
    private String urlvalue;
    private IImgDownloaderListener listener;

    public ImgDownloader(String id, String url,IImgDownloaderListener listener) {
        this.id = id;
        this.urlvalue = url;
        this.listener = listener;
        Log.i("Flag","pre img ");
    }

    @Override
    protected Bitmap doInBackground(Void... voids) {
        Log.i("Flag","img init");
        Bitmap bitmap = null;
        try {
            URL url = new URL(urlvalue);
            InputStream is = (InputStream) url.getContent();
            bitmap = BitmapFactory.decodeStream(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.i("Flag","img end");

        return bitmap;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        Log.i("Flag","post img ");
        listener.onBitmapRecived(bitmap,id);
    }
}

