package com.poturno.vitor.owinfo.activity.heroDetail;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.poturno.vitor.owinfo.R;
import com.poturno.vitor.owinfo.adapter.AbilityListAdapter;
import com.poturno.vitor.owinfo.helper.KeyWords;
import com.poturno.vitor.owinfo.model.Ability;
import com.poturno.vitor.owinfo.model.Hero;

import java.util.ArrayList;

public class HeroDetailActivity extends AppCompatActivity {

    private IHeroDetailPresenter presenter;
    private ImageView heroImg;
    private TextView name;
    private TextView role;
    private TextView realName;
    private TextView description;
    private TextView health;
    private TextView armour;
    private TextView affiliation;
    private TextView height;
    private TextView baseOfOperation;
    private RatingBar difficulty;
    private ListView abilitiesListView;

    private ArrayAdapter<Ability> adapter;
    private ArrayList<Ability> abilities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_detail);

        heroImg = (ImageView)findViewById(R.id.iv_hero_dedtail_img);
        name = (TextView)findViewById(R.id.txt_name);
        role = (TextView)findViewById(R.id.txt_role);
        realName = (TextView)findViewById(R.id.txt_real_name);
        description = (TextView)findViewById(R.id.txt_description);
        health = (TextView)findViewById(R.id.txt_health_value);
        armour = (TextView)findViewById(R.id.txt_armour_value);
        affiliation = (TextView)findViewById(R.id.txt_affiliation_value);
        height = (TextView) findViewById(R.id.txt_height_value);
        baseOfOperation = (TextView)findViewById(R.id.txt_base_value);
        difficulty = (RatingBar)findViewById(R.id.rb_difficult_value);


        abilitiesListView = (ListView)findViewById(R.id.lv_abilities);

        abilities = new ArrayList<Ability>();
        adapter = new AbilityListAdapter(this,abilities);
        abilitiesListView.setAdapter(adapter);

        Intent intent = getIntent();
        String id = intent.getStringExtra(KeyWords.ID);
        presenter = new HeroDetailPresenter(HeroDetailActivity.this);
        presenter.getHeroDetail(id);

        abilitiesListView.setFocusable(false);
        abilitiesListView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });


    }

    public void printHeroDetail(Hero hero){
        name.setText(hero.getName());
        name.setContentDescription(hero.getName());
        role.setText(hero.getRole());
        role.setContentDescription(hero.getRole());
        realName.setText(hero.getRealName());
        realName.setContentDescription(hero.getRealName());
        description.setText(hero.getDescription());
        description.setContentDescription(hero.getDescription());
        health.setText(String.valueOf(hero.getHealth()));
        health.setContentDescription(String.valueOf(hero.getHealth()));
        armour.setText(String.valueOf(hero.getArmour()));
        armour.setContentDescription(String.valueOf(hero.getArmour()));
        affiliation.setText(hero.getAffiliation());
        affiliation.setContentDescription(hero.getAffiliation());
        height.setText(hero.getHeight());
        height.setContentDescription(hero.getHeight());
        baseOfOperation.setText(hero.getBaseOfOperations());
        baseOfOperation.setContentDescription(hero.getBaseOfOperations());
        difficulty.setRating(Float.parseFloat(hero.getDifficulty()));
        difficulty.setContentDescription(hero.getDifficulty());
        abilities.addAll(hero.getAbilities());
        adapter.notifyDataSetChanged();

    }

    public void printHeroImg(Bitmap bitmap){
        heroImg.setImageBitmap(bitmap);
    }
}
