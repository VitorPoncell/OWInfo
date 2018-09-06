package com.poturno.vitor.owinfo.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.poturno.vitor.owinfo.R;
import com.poturno.vitor.owinfo.model.Map;

import java.util.ArrayList;

public class MapsListAdapter extends ArrayAdapter<Map>{

    private Context context;
    private ArrayList<Map> maps;

    public MapsListAdapter(Context context, ArrayList<Map> objects) {
        super(context, 0, objects);
        this.context = context;
        this.maps = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View _view = convertView;
        MapsListAdapter.ViewHoldeer vh;

        if(maps != null){
            if(_view==null){
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                _view = inflater.inflate(R.layout.map_list,parent,false);
                vh = new MapsListAdapter.ViewHoldeer();
                vh.mapItemName = (TextView) _view.findViewById(R.id.txt_map_item_name);
                vh.mapItemImg = (ImageView)_view.findViewById(R.id.iv_map_img);
                _view.setTag(vh);
            }else{
                vh = (MapsListAdapter.ViewHoldeer) _view.getTag();
            }

            String heroName = maps.get(position).getName();
            vh.mapItemName.setText(heroName);
            Bitmap bitmap = maps.get(position).getSmallImg();
            vh.mapItemImg.setImageBitmap(bitmap);

        }

        return _view;
    }

    private static class ViewHoldeer{
        public TextView mapItemName;
        public ImageView mapItemImg;
    }
}
