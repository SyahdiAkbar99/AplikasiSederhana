package com.syahdiakbar.aplikasisederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.syahdiakbar.aplikasisederhana.activity.KalkulatorActivity;
import com.syahdiakbar.aplikasisederhana.activity.ListViewNegaraActivity;
import com.syahdiakbar.aplikasisederhana.activity.TampilNamaActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgNama, imKalkulate, imgLVNegara;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgNama = findViewById(R.id.img_tampilnama);
        imKalkulate = findViewById(R.id.img_kalkulator);
        imgLVNegara = findViewById(R.id.img_lv_negara);

        imgNama.setOnClickListener(this);
        imKalkulate.setOnClickListener(this);
        imgLVNegara.setOnClickListener(this);

        getSupportActionBar().setTitle("Home");
    }


    @Override
    public void onClick(View view){
        int id = view.getId();
        switch (id){
            case R.id.img_tampilnama :
                startActivity(new Intent(this, TampilNamaActivity.class));
                break;
            case R.id.img_kalkulator :
                startActivity(new Intent(this, KalkulatorActivity.class));
                break;
            case R.id.img_lv_negara :
                startActivity(new Intent(this, ListViewNegaraActivity.class));
                break;
        }
    }
}