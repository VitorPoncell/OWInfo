package com.poturno.vitor.owinfo.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.poturno.vitor.owinfo.R;

import java.util.ArrayList;

public class MenuAdapter extends ArrayAdapter<String> {

    private Context context;
    private ArrayList<String> objects;

    public MenuAdapter(@NonNull Context context, ArrayList<String> objects) {
        super(context, 0, objects);
        this.context = context;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View _view = convertView;
        MenuAdapter.ViewHoldeer vh;

        if(objects != null){
            if(_view==null){
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                _view = inflater.inflate(R.layout.menu_list,parent,false);
                vh = new MenuAdapter.ViewHoldeer();
                vh.itemName = (TextView) _view.findViewById(R.id.txt_menu_item_name);
                _view.setTag(vh);
            }else{
                vh = (MenuAdapter.ViewHoldeer) _view.getTag();
            }

            String menuName = objects.get(position);
            vh.itemName.setText(menuName);
            vh.itemName.setContentDescription(menuName);
        }

        return _view;
    }

    private static class ViewHoldeer{
        public TextView itemName;
    }
}
