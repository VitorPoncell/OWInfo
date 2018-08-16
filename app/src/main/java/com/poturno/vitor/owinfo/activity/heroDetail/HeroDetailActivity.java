package com.poturno.vitor.owinfo.activity.heroDetail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.poturno.vitor.owinfo.R;
import com.poturno.vitor.owinfo.helper.KeyWords;
import com.poturno.vitor.owinfo.model.Hero;

public class HeroDetailActivity extends AppCompatActivity {

    private IHeroDetailPresenter presenter;
    private TextView name;
    private TextView realName;
    private TextView description;
    private TextView health;
    private TextView armour;
    private TextView affiliation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_detail);

        name = (TextView)findViewById(R.id.txt_name);
        realName = (TextView)findViewById(R.id.txt_real_name);
        description = (TextView)findViewById(R.id.txt_description);
        health = (TextView)findViewById(R.id.txt_health_value);
        armour = (TextView)findViewById(R.id.txt_armour_value);
        affiliation = (TextView)findViewById(R.id.txt_affiliation_value);

        Intent intent = getIntent();
        String id = intent.getStringExtra(KeyWords.ID);

        presenter = new HeroDetailPresenter(HeroDetailActivity.this);
        presenter.getHeroDetail(id);


    }

    public void printHeroDetail(Hero hero){
        name.setText(hero.getName());
        realName.setText(hero.getRealName());
        description.setText(hero.getDescription());
        health.setText(String.valueOf(hero.getHealth()));
        armour.setText(String.valueOf(hero.getArmour()));
        affiliation.setText(hero.getAffiliation());

    }
}
