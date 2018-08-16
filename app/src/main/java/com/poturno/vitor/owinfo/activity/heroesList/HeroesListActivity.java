package com.poturno.vitor.owinfo.activity.heroesList;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.poturno.vitor.owinfo.R;
import com.poturno.vitor.owinfo.activity.heroDetail.HeroDetailActivity;
import com.poturno.vitor.owinfo.adapter.HeroListAdapter;
import com.poturno.vitor.owinfo.helper.KeyWords;
import com.poturno.vitor.owinfo.model.Hero;

import java.util.ArrayList;

public class HeroesListActivity extends AppCompatActivity {

    private IHeroesListPresenter presenter;
    private ListView listView;
    private ArrayAdapter<Hero> adapter;
    private ArrayList<Hero> heroes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes_list);

        listView = (ListView)findViewById(R.id.lv_heroes);

        heroes = new ArrayList<Hero>();
        adapter = new HeroListAdapter(this,heroes);
        listView.setAdapter(adapter);

        presenter = new HeroesListPresenter(this);
        presenter.getHeroesList();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(HeroesListActivity.this, HeroDetailActivity.class);
                intent.putExtra(KeyWords.ID,heroes.get(position).getId());
                startActivity(intent);

            }
        });

    }

    public void printHero(Hero hero){
        heroes.add(hero);
        adapter.notifyDataSetChanged();
    }
}
