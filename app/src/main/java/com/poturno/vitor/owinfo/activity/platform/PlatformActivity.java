package com.poturno.vitor.owinfo.activity.platform;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.poturno.vitor.owinfo.R;
import com.poturno.vitor.owinfo.adapter.PlatformAdapter;
import com.poturno.vitor.owinfo.model.Platform;

import java.util.ArrayList;

public class PlatformActivity extends AppCompatActivity {

    private ProgressDialog dialog;

    private IPlatformPresenter presenter;
    private ListView listView;
    private ArrayAdapter<Platform> adapter;
    private ArrayList<Platform> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_platform);

        listView = (ListView)findViewById(R.id.lv_platform_itens);

        list = new ArrayList<>();
        adapter = new PlatformAdapter(this,list);
        listView.setAdapter(adapter);

        presenter = new PlatformPresenter(this);
        presenter.getPlatformList();
    }

    public void printPlatform(Platform platform){
        list.add(platform);
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
