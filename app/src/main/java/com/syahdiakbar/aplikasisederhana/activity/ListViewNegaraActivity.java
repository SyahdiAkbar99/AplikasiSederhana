package com.syahdiakbar.aplikasisederhana.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.syahdiakbar.aplikasisederhana.R;

public class ListViewNegaraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_negara);

        setTitle("List View Negara");
    }
}