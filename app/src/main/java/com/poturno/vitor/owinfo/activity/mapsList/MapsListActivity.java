package com.poturno.vitor.owinfo.activity.mapsList;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.poturno.vitor.owinfo.R;
import com.poturno.vitor.owinfo.activity.mapDetail.MapDetailActivity;
import com.poturno.vitor.owinfo.adapter.MapsListAdapter;
import com.poturno.vitor.owinfo.helper.KeyWords;
import com.poturno.vitor.owinfo.model.Map;

import java.util.ArrayList;

public class MapsListActivity extends AppCompatActivity {

    private IMapsListPresenter presenter;
    private ListView listView;
    private ArrayAdapter<Map> adapter;
    private ArrayList<Map> maps;

    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_list);

        listView = (ListView)findViewById(R.id.lv_maps);

        maps = new ArrayList<Map>();
        adapter = new MapsListAdapter(this,maps);
        listView.setAdapter(adapter);

        presenter = new MapsListPresenter(this);
        presenter.getMapsList();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MapsListActivity.this,MapDetailActivity.class);
                intent.putExtra(KeyWords.ID,maps.get(position).getId());
                startActivity(intent);
            }
        });

    }

    public void printMap(Map map){
        maps.add(map);
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

    public void updateImg(int id, Bitmap bitmap) {
        maps.get(id).setSmallImg(bitmap);
        adapter.notifyDataSetChanged();
    }
}
