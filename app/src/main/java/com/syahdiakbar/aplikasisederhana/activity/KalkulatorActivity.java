package com.syahdiakbar.aplikasisederhana.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.syahdiakbar.aplikasisederhana.R;

public class KalkulatorActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edtAngka1, edtAngka2;
    private Button btnPlus, btnMinus, btnTimes, btnDevide;
    private TextView txtHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        edtAngka1 = findViewById(R.id.edtAngka1);
        edtAngka2 = findViewById(R.id.edtAngkaKedua);
        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnTimes = findViewById(R.id.btn_times);
        btnDevide = findViewById(R.id.btn_devide);
        txtHasil = findViewById(R.id.txtHasil);

        setTitle("Kalkulator");
    }

    @Override
    public void onClick(View view) {

    }

    public void actionTambah(View view) {
        double angka1 = Double.parseDouble(edtAngka1.getText().toString());
        double angka2 = Double.parseDouble(edtAngka2.getText().toString());
        double hasil = angka1 + angka2;
        txtHasil.setText(String.valueOf(hasil));
    }

    public void actionKurangi(View view) {
        double angka1 = Double.parseDouble(edtAngka1.getText().toString());
        double angka2 = Double.parseDouble(edtAngka2.getText().toString());
        double hasil = angka1 - angka2;
        txtHasil.setText(String.valueOf(hasil));
    }

    public void actionKali(View view) {
        double angka1 = Double.parseDouble(edtAngka1.getText().toString());
        double angka2 = Double.parseDouble(edtAngka2.getText().toString());
        double hasil = angka1 * angka2;
        txtHasil.setText(String.valueOf(hasil));
    }

    public void actionBagi(View view) {
        double angka1 = Double.parseDouble(edtAngka1.getText().toString());
        double angka2 = Double.parseDouble(edtAngka2.getText().toString());
        double hasil = angka1 / angka2;
        txtHasil.setText(String.valueOf(hasil));
    }

    public void actionBersih(View view) {
        edtAngka1.setText("");
        edtAngka2.setText("");
        txtHasil.setText("0.0");
    }
}