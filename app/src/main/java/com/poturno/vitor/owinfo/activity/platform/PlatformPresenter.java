package com.poturno.vitor.owinfo.activity.platform;

import com.poturno.vitor.owinfo.activity.brawl.BrawlIterator;
import com.poturno.vitor.owinfo.helper.IIterator;
import com.poturno.vitor.owinfo.helper.IIteratorListener;
import com.poturno.vitor.owinfo.model.Platform;

public class PlatformPresenter implements IPlatformPresenter, IIteratorListener{

    private PlatformActivity activity;
    private IIterator iterator;

    public PlatformPresenter(PlatformActivity activity){
        this.activity = activity;
    }

    @Override
    public void getPlatformList() {
        activity.waitOperation();
        iterator = new PlatformIterator(this, activity);

    }

    @Override
    public void ready() {
        activity.stopWait();
        while (iterator.hasNext()){
            activity.printPlatform((Platform) iterator.next());
        }

    }
}
