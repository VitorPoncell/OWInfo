package com.poturno.vitor.owinfo.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.poturno.vitor.owinfo.R;
import com.poturno.vitor.owinfo.model.Ability;

import java.util.ArrayList;

public class AbilityListAdapter extends ArrayAdapter<Ability>{

    private Context context;
    private ArrayList<Ability> abilities;

    public AbilityListAdapter(Context context, ArrayList<Ability> objects) {
        super(context, 0, objects);
        this.context = context;
        this.abilities = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View _view = convertView;
        AbilityListAdapter.ViewHoldeer vh;

        if(abilities != null){
            if(_view==null){
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                _view = inflater.inflate(R.layout.ability_list,parent,false);
                vh = new AbilityListAdapter.ViewHoldeer();
                vh.ablilityName = (TextView) _view.findViewById(R.id.txt_ability_item_name);
                vh.abilityDescription = (TextView) _view.findViewById(R.id.txt_ability_item_description);
                vh.abilityUltmate = (TextView) _view.findViewById(R.id.txt_ability_item_ultimate);
                _view.setTag(vh);
            }else{
                vh = (AbilityListAdapter.ViewHoldeer) _view.getTag();
            }


            if(abilities.get(position).isUltimate()){
                vh.abilityUltmate.setText("\nUltimate");
            }else{
                vh.abilityUltmate.setText("");
            }

            String name = abilities.get(position).getName();
            vh.ablilityName.setText(name);
            String description = abilities.get(position).getDescription();
            vh.abilityDescription.setText(description);

        }

        return _view;
    }

    private static class ViewHoldeer{
        public TextView abilityUltmate;
        public TextView ablilityName;
        public TextView abilityDescription;
    }
}
