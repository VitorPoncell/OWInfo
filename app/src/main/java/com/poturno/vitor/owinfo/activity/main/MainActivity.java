package com.poturno.vitor.owinfo.activity.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.poturno.vitor.owinfo.R;
import com.poturno.vitor.owinfo.activity.heroesList.HeroesListActivity;
import com.poturno.vitor.owinfo.adapter.MenuAdapter;
import com.poturno.vitor.owinfo.helper.KeyWords;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.lv_menu);
        
        items = new ArrayList<>();
        items.add(KeyWords.HEROES);
        items.add(KeyWords.MAPS);

        adapter = new MenuAdapter(this,items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (items.get(position)){
                    case KeyWords.HEROES:
                        openHeroesActivity();
                        break;

                }

            }
        });

    }

    private void openHeroesActivity(){
        Intent intent = new Intent(MainActivity.this, HeroesListActivity.class);
        startActivity(intent);
    }
}
