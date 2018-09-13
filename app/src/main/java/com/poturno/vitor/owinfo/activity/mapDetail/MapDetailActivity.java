package com.poturno.vitor.owinfo.activity.mapDetail;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.poturno.vitor.owinfo.R;
import com.poturno.vitor.owinfo.helper.KeyWords;
import com.poturno.vitor.owinfo.model.Map;

public class MapDetailActivity extends AppCompatActivity {

    private ProgressDialog dialog;

    private IMapDetailPresenter presenter;
    private ImageView imageView;
    private TextView name;
    private TextView location;
    private TextView mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_detail);

        imageView = (ImageView)findViewById(R.id.iv_map_detail);
        name = (TextView)findViewById(R.id.tv_map_name);
        location = (TextView)findViewById(R.id.tv_map_location);
        mode = (TextView)findViewById(R.id.tv_map_mode);

        Intent intent = getIntent();
        String id = intent.getStringExtra(KeyWords.ID);

        presenter = new MapDetailPresenter(this);
        presenter.getMapDetail(id);
    }

    public void printMapDetail(Map map){
        name.setText(map.getName());
        location.setText(map.getLocation());
        mode.setText(map.getMode());
    }

    public void printImage(Bitmap bitmap){
        imageView.setImageBitmap(bitmap);
    }

    public void waitOperation() {
        dialog = new ProgressDialog(this);
        dialog.setTitle("Loading");
        dialog.setMessage("Aguarde...");
        dialog.show();

    }

    public void stopWait() {
        dialog.dismiss();
    }
}
