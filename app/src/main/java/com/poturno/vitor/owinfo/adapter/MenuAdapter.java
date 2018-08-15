package com.poturno.vitor.owinfo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.poturno.vitor.owinfo.R;

import java.util.ArrayList;

public class MenuAdapter extends ArrayAdapter<String>{

    private Context context;
    private ArrayList<String> strings;

    public MenuAdapter(Context context, ArrayList<String> objects) {
        super(context, 0, objects);
        this.context = context;
        this.strings = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View _view = convertView;
        ViewHoldeer vh;

        if(strings != null){
            if(_view==null){
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                _view = inflater.inflate(R.layout.menu_list,parent,false);
                vh = new ViewHoldeer();
                vh.itemName = (TextView) _view.findViewById(R.id.txt_menu_item_name);
                _view.setTag(vh);
            }else{
                vh = (ViewHoldeer) _view.getTag();
            }

            String itemName = strings.get(position);

            vh.itemName.setText(itemName);

        }

        return _view;
    }

    private static class ViewHoldeer{
        public TextView itemName;
    }
}
