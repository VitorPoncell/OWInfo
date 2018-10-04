package com.poturno.vitor.owinfo.activity.heroesList;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.poturno.vitor.owinfo.R;
import com.poturno.vitor.owinfo.activity.heroDetail.HeroDetailActivity;
import com.poturno.vitor.owinfo.adapter.HeroListAdapter;
import com.poturno.vitor.owinfo.helper.KeyWords;
import com.poturno.vitor.owinfo.model.Hero;

import java.util.ArrayList;

public class HeroesListActivity extends AppCompatActivity {

    private IHeroesListPresenter presenter;
    private GridView gridView;
    private ArrayAdapter<Hero> adapter;
    private ArrayList<Hero> heroes;

    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes_list);

        gridView = (GridView) findViewById(R.id.gv_heroes);

        heroes = new ArrayList<Hero>();
        adapter = new HeroListAdapter(this, heroes);
        gridView.setAdapter(adapter);

        presenter = new HeroesListPresenter(this);
        presenter.getHeroesList();

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(HeroesListActivity.this, HeroDetailActivity.class);
                intent.putExtra(KeyWords.ID, heroes.get(position).getId());
                startActivity(intent);

            }
        });

    }

    public void waitOperation() {
        dialog = new ProgressDialog(this);
        dialog.setTitle(KeyWords.LOADING);
        dialog.setMessage(KeyWords.WAIT);
        dialog.show();

    }

    public void stopWait() {
        dialog.dismiss();
    }

    public void printHero(Hero hero) {
        heroes.add(hero);
        adapter.notifyDataSetChanged();
    }

    public void updateImg(int id, Bitmap img) {
        heroes.get(id).setPortraitIcon(img);
        adapter.notifyDataSetChanged();
    }

}
