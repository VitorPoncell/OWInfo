package com.poturno.vitor.owinfo.activity.main;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.poturno.vitor.owinfo.R;
import com.poturno.vitor.owinfo.activity.brawl.BrawlActivity;
import com.poturno.vitor.owinfo.activity.gameMode.GameModeActivity;
import com.poturno.vitor.owinfo.activity.heroesList.HeroesListActivity;
import com.poturno.vitor.owinfo.activity.mapsList.MapsListActivity;
import com.poturno.vitor.owinfo.activity.platform.PlatformActivity;
import com.poturno.vitor.owinfo.helper.KeyWords;
import com.poturno.vitor.owinfo.helper.MenuKeys;
import com.poturno.vitor.owinfo.helper.Url;
import com.poturno.vitor.owinfo.model.GameMode;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> items;

    private TextView webPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.lv_menu);
        webPage = (TextView)findViewById(R.id.tv_web_page);
        
        items = new ArrayList<>();
        items.addAll(Arrays.asList(MenuKeys.items));

        adapter = new ArrayAdapter<String>(this,R.layout.menu_list,R.id.txt_menu_item_name,items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(isOnline()){
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
                        case MenuKeys.PLATFORM:
                            openPlataformActivity();
                            break;
                    }
                }else{
                    askForInternet();
                }


            }
        });

        webPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(Url.WEB_PAGE));
                    startActivity(intent);
                }catch (Exception e){

                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(KeyWords.ASK_EXIT);

        builder.setPositiveButton(KeyWords.YES, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton(KeyWords.NO, null);
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


    protected boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnectedOrConnecting()) {
            return true;
        } else {
            return false;
        }
    }

    private void askForInternet(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(KeyWords.ASK_NET)
                .setCancelable(false)
                .setPositiveButton(KeyWords.YES_NET, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
                    }
                })
                .setNegativeButton(KeyWords.EXIT, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        builder.create();
        builder.show();
    }

}
