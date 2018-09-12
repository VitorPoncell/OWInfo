package com.poturno.vitor.owinfo.activity.main;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.poturno.vitor.owinfo.R;
import com.poturno.vitor.owinfo.activity.brawl.BrawlActivity;
import com.poturno.vitor.owinfo.activity.gameMode.GameModeActivity;
import com.poturno.vitor.owinfo.activity.heroesList.HeroesListActivity;
import com.poturno.vitor.owinfo.activity.mapsList.MapsListActivity;
import com.poturno.vitor.owinfo.activity.platform.PlatformActivity;
import com.poturno.vitor.owinfo.helper.KeyWords;
import com.poturno.vitor.owinfo.helper.MenuKeys;
import com.poturno.vitor.owinfo.model.GameMode;

import java.util.ArrayList;
import java.util.Arrays;

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
        items.addAll(Arrays.asList(MenuKeys.items));

        adapter = new ArrayAdapter<String>(this,R.layout.menu_list,R.id.txt_menu_item_name,items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (items.get(position)){
                    case MenuKeys.HEROES:
                        openHeroesListActivity();
                        break;
                    case MenuKeys.MAPS:
                        openMapsListActivity();
                        break;
                    case MenuKeys.GAME_MODE:
                        openGameModeActivity();
                        break;
                    case MenuKeys.BRAWL:
                        openBrawlActivity();
                        break;
                    case MenuKeys.PLATAFORM:
                        openPlataformActivity();
                        break;


                }

            }
        });



    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Sair do OWInfo?");

        builder.setPositiveButton("Sair", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("Não", null);
        builder.create();
        builder.show();
    }

    private void openHeroesListActivity(){
        Intent intent = new Intent(MainActivity.this, HeroesListActivity.class);
        startActivity(intent);
    }

    private void openMapsListActivity(){
        Intent intent = new Intent(MainActivity.this, MapsListActivity.class);
        startActivity(intent);
    }

    private void openGameModeActivity(){
        Intent intent = new Intent(MainActivity.this, GameModeActivity.class);
        startActivity(intent);
    }

    private void openBrawlActivity(){
        Intent intent = new Intent(MainActivity.this, BrawlActivity.class);
        startActivity(intent);
    }

    private void openPlataformActivity(){
        Intent intent = new Intent(MainActivity.this, PlatformActivity.class);
        startActivity(intent);
    }
}
