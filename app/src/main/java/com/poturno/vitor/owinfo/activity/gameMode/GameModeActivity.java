package com.poturno.vitor.owinfo.activity.gameMode;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.poturno.vitor.owinfo.R;
import com.poturno.vitor.owinfo.adapter.GameModeListAdapter;
import com.poturno.vitor.owinfo.model.GameMode;

import java.util.ArrayList;

public class GameModeActivity extends AppCompatActivity {

    private ProgressDialog dialog;

    private IGameModePresenter presenter;
    private ListView listView;
    private ArrayAdapter<GameMode> adapter;
    private ArrayList<GameMode> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_mode);

        listView = (ListView)findViewById(R.id.lv_game_mode_itens);

        list = new ArrayList<GameMode>();
        adapter = new GameModeListAdapter(this,list);
        listView.setAdapter(adapter);

        presenter = new GameModePresenter(this);
        presenter.getGameModes();
    }

    public void printGameMode(GameMode gameMode){
        list.add(gameMode);
        adapter.notifyDataSetChanged();
    }

    public void waitOperation(){
        dialog = new ProgressDialog(this);
        dialog.setTitle("Loading");
        dialog.setMessage("Aguarde...");
        dialog.show();

    }

    public void stopWait(){
        dialog.dismiss();
    }
}
