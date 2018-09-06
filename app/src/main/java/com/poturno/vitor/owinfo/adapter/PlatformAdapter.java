package com.poturno.vitor.owinfo.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.poturno.vitor.owinfo.R;
import com.poturno.vitor.owinfo.model.Platform;

import java.util.ArrayList;

public class PlatformAdapter extends ArrayAdapter {
    private Context context;
    private ArrayList<Platform> platformArrayList;

    public PlatformAdapter (Context context, ArrayList<Platform> objects) {
        super(context, 0, objects);
        this.context = context;
        this.platformArrayList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View _view = convertView;
        ViewHolder vh;

        if(platformArrayList != null){
            if(_view==null){
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                _view = inflater.inflate(R.layout.platform_list,parent,false);
                vh = new ViewHolder();
                vh.plataformName = (TextView) _view.findViewById(R.id.tv_platform_name);
                vh.plataformImg = (ImageView) _view.findViewById(R.id.iv_platform_img);
                _view.setTag(vh);
            }else{
                vh = (ViewHolder) _view.getTag();
            }

            String name = platformArrayList.get(position).getName();
            vh.plataformName.setText(name);
            Bitmap bitmap = platformArrayList.get(position).getBitmap();
            vh.plataformImg.setImageBitmap(bitmap);

        }

        return _view;
    }

    private static class ViewHolder {
        public TextView plataformName;
        public ImageView plataformImg;
    }
}
