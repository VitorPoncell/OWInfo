package com.poturno.vitor.owinfo.downloader;

import android.graphics.Bitmap;

public interface IImgDownloaderListener {

    public void onBitmapRecived(Bitmap bitmap,String id);
}
