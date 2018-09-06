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
import com.poturno.vitor.owinfo.model.GameMode;

import java.util.ArrayList;

public class GameModeListAdapter extends ArrayAdapter<GameMode> {

    private Context context;
    private ArrayList<GameMode> list;

    public GameModeListAdapter(Context context, ArrayList<GameMode> objects) {
        super(context,0,objects);

        this.context = context;
        this.list = objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View _view = convertView;
        GameModeListAdapter.ViewHoldeer vh;

        if(list != null){
            if(_view==null){
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                _view = inflater.inflate(R.layout.game_mode_list,parent,false);
                vh = new GameModeListAdapter.ViewHoldeer();
                vh.gameModeName = (TextView)_view.findViewById(R.id.tv_game_mode_name);
                vh.gameModeImg = (ImageView)_view.findViewById(R.id.iv_game_mode_img);
                _view.setTag(vh);
            }else{
                vh = (GameModeListAdapter.ViewHoldeer) _view.getTag();
            }


            String name = list.get(position).getName();
            vh.gameModeName.setText(name);
            Bitmap img = list.get(position).getImg();
            vh.gameModeImg.setImageBitmap(img);

        }

        return _view;
    }

    private static class ViewHoldeer{
        public TextView gameModeName;
        public ImageView gameModeImg;

    }
}
