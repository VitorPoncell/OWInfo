package com.poturno.vitor.owinfo.activity.heroesList;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.poturno.vitor.owinfo.R;
import com.poturno.vitor.owinfo.model.Hero;

public class HeroesListActivity extends AppCompatActivity {

    private IHeroesListPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes_list);
        presenter = new HeroesListPresenter(this);
        presenter.getHeroesList();
    }

    public void printHero(Hero hero){
        Log.i("Flag",hero.getName());
    }
}
