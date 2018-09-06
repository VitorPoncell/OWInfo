package com.poturno.vitor.owinfo.activity.gameMode;

import com.poturno.vitor.owinfo.downloader.IDownloaderListener;
import com.poturno.vitor.owinfo.downloader.JsonDownloader;
import com.poturno.vitor.owinfo.helper.IIterator;
import com.poturno.vitor.owinfo.helper.IIteratorListener;
import com.poturno.vitor.owinfo.helper.Url;
import com.poturno.vitor.owinfo.model.GameMode;

public class GameModePresenter implements IGameModePresenter, IIteratorListener {

    private GameModeActivity activity;
    private IIterator iterator;

    public GameModePresenter(GameModeActivity activity){
        this.activity = activity;
    }

    @Override
    public void getGameModes() {
        activity.waitOperation();
        iterator = new GameModeIterator(this);

    }


    @Override
    public void ready() {
        activity.stopWait();
        while (iterator.hasNext()){
            activity.printGameMode((GameMode) iterator.next());
        }
        /*for(int i = 0 ; i<iterator.size();i++){
            new ImgDownloader(""+(i+1),Url.getSmallHeroImg(""+(i+1)),this).execute();
        }*/
    }
}
