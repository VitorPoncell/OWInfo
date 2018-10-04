package com.poturno.vitor.owinfo.activity.brawl;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.poturno.vitor.owinfo.R;
import com.poturno.vitor.owinfo.adapter.BrawlListAdapter;
import com.poturno.vitor.owinfo.helper.KeyWords;
import com.poturno.vitor.owinfo.model.Brawl;

import java.util.ArrayList;

public class BrawlActivity extends AppCompatActivity {

    private ProgressDialog dialog;

    private IBrawlPresenter presenter;
    private ListView listView;
    private ArrayAdapter<Brawl> adapter;
    private ArrayList<Brawl> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brawl);

        listView = (ListView)findViewById(R.id.lv_brawl_itens);

        list = new ArrayList<>();
        adapter = new BrawlListAdapter(this,list);
        listView.setAdapter(adapter);

        presenter = new BrawlPresenter(this);
        presenter.getBrawlList();

    }
    public void printBrawl(Brawl brawl){
        list.add(brawl);
        adapter.notifyDataSetChanged();
    }


    public void waitOperation(){
        dialog = new ProgressDialog(this);
        dialog.setTitle(KeyWords.LOADING);
        dialog.setMessage(KeyWords.WAIT);
        dialog.show();

    }

    public void stopWait(){
        dialog.dismiss();
    }
}
