package com.poturno.vitor.owinfo.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.poturno.vitor.owinfo.R;
import com.poturno.vitor.owinfo.model.Hero;

import java.util.ArrayList;

public class HeroListAdapter extends ArrayAdapter<Hero> {
    private Context context;
    private ArrayList<Hero> heroes;

    public HeroListAdapter(Context context, ArrayList<Hero> objects) {
        super(context, 0, objects);
        this.context = context;
        this.heroes = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View _view = convertView;
        final ViewHoldeer vh;

        if (heroes != null) {
            if (_view == null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                _view = inflater.inflate(R.layout.hero_list, parent, false);
                vh = new ViewHoldeer();
                vh.heroImg = (ImageView) _view.findViewById(R.id.iv_hero_img);
                vh.heroItemName = (TextView) _view.findViewById(R.id.txt_hero_item_name);
                _view.setTag(vh);
            } else {
                vh = (ViewHoldeer) _view.getTag();
            }

            String heroName = heroes.get(position).getName();
            vh.heroItemName.setText(heroName);
            Bitmap img = heroes.get(position).getPortraitIcon();
            vh.heroImg.setImageBitmap(img);

        }

        return _view;
    }


    private static class ViewHoldeer {
        public ImageView heroImg;
        public TextView heroItemName;
    }
}
