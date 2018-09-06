package com.poturno.vitor.owinfo.activity.brawl;

import com.poturno.vitor.owinfo.helper.IIterator;
import com.poturno.vitor.owinfo.helper.IIteratorListener;
import com.poturno.vitor.owinfo.model.Brawl;

public class BrawlPresenter implements IBrawlPresenter, IIteratorListener {


    private BrawlActivity activity;
    private IIterator iterator;

    public BrawlPresenter(BrawlActivity activity){
        this.activity = activity;
    }

    @Override
    public void getBrawlList() {
        activity.waitOperation();
        iterator = new BrawlIterator(this);

    }

    @Override
    public void ready() {
        activity.stopWait();
        while (iterator.hasNext()){
            activity.printBrawl((Brawl) iterator.next());
        }

    }


}
