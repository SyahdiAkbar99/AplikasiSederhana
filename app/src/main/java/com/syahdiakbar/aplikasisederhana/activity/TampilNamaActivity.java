package com.syahdiakbar.aplikasisederhana.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.syahdiakbar.aplikasisederhana.R;

public class TampilNamaActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText edtname;
    private Button btnTampil;
    private TextView txtHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_nama);

        setTitle("Tampil Nama");

        edtname = findViewById(R.id.edt_text_name);
        btnTampil = findViewById(R.id.btn_tampil);
        txtHasil = findViewById(R.id.txt_hasil);

        btnTampil.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (edtname.getText().toString().isEmpty()){
            Toast.makeText(this, "Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        }else{
            txtHasil.setText(edtname.getText().toString());
        }
    }
}