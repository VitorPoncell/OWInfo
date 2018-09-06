package com.poturno.vitor.owinfo.activity.mapsList;

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
import com.poturno.vitor.owinfo.model.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

public class MapsListPresenter implements IMapsListPresenter, IIteratorListener, IImgDownloaderListener{

    private MapsListActivity activity;
    private IIterator iterator;

    public MapsListPresenter(MapsListActivity activity) {
        this.activity = activity;
    }

    @Override
    public void getMapsList() {
        activity.waitOperation();
        iterator = new MapsListIteractor(this);
    }


    @Override
    public void ready() {
        activity.stopWait();
        while (iterator.hasNext()) {
            activity.printMap((Map) iterator.next());
        }
        for(int i = 0 ; i<iterator.size();i++){
            new ImgDownloader(""+(i+1),Url.getMapSmallImg(""+(i+1)),this).execute();
        }

    }

    @Override
    public void onBitmapRecived(Bitmap bitmap, String id) {
        activity.updateImg(Integer.parseInt(id)-1,bitmap);
    }
}
