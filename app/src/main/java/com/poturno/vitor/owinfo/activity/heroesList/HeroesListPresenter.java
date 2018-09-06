package com.poturno.vitor.owinfo.activity.heroesList;

import android.graphics.Bitmap;

import com.poturno.vitor.owinfo.downloader.IImgDownloaderListener;
import com.poturno.vitor.owinfo.downloader.ImgDownloader;
import com.poturno.vitor.owinfo.helper.IIterator;
import com.poturno.vitor.owinfo.helper.IIteratorListener;
import com.poturno.vitor.owinfo.helper.Url;
import com.poturno.vitor.owinfo.model.Hero;

public class HeroesListPresenter implements IHeroesListPresenter, IIteratorListener, IImgDownloaderListener{

    private HeroesListActivity activity;
    private IIterator iterator;

    public HeroesListPresenter(HeroesListActivity activity){
        this.activity = activity;
    }

    @Override
    public void getHeroesList(){
        activity.waitOperation();
        iterator = new HeroesListIterator(this);

    }


    @Override
    public void ready() {
        activity.stopWait();
        while (iterator.hasNext()){
            activity.printHero((Hero) iterator.next());
        }
        for(int i = 0 ; i<iterator.size();i++){
            new ImgDownloader(""+(i+1),Url.getSmallHeroImg(""+(i+1)),this).execute();
        }

    }

    @Override
    public void onBitmapRecived(Bitmap bitmap, String id) {
        activity.updateImg(Integer.parseInt(id)-1,bitmap);
    }
}
