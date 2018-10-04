package com.poturno.vitor.owinfo.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.poturno.vitor.owinfo.R;
import com.poturno.vitor.owinfo.model.Brawl;

import java.util.ArrayList;

public class BrawlListAdapter extends ArrayAdapter<Brawl> {
    private Context context;
    private ArrayList<Brawl> brawlArrayList;

    public BrawlListAdapter (Context context, ArrayList<Brawl> objects) {
        super(context, 0, objects);
        this.context = context;
        this.brawlArrayList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View _view = convertView;
        ViewHolder vh;

        if(brawlArrayList != null){
            if(_view==null){
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                _view = inflater.inflate(R.layout.brawl_list,parent,false);
                vh = new ViewHolder();
                vh.brawlName = (TextView) _view.findViewById(R.id.tv_brawl_name);
                vh.brawlImg = (ImageView) _view.findViewById(R.id.iv_brawl_img);
                _view.setTag(vh);
            }else{
                vh = (ViewHolder) _view.getTag();
            }


            String name = brawlArrayList.get(position).getName();
            vh.brawlName.setText(name);
            vh.brawlName.setContentDescription(name);
            Bitmap bitmap = brawlArrayList.get(position).getBitmap();
            vh.brawlImg.setImageBitmap(bitmap);

        }

        return _view;
    }

    private static class ViewHolder {
        public TextView brawlName;
        public ImageView brawlImg;
    }
}
