package com.syahdiakbar.aplikasisederhana.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.syahdiakbar.aplikasisederhana.R;

public class ListViewNegaraActivity extends AppCompatActivity {

    private ListView listviewCountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_negara);

        getSupportActionBar().setTitle("List View Negara");

        String countryArr [] = new String[]{
                "Indonesia",
                "Malaysia",
                "Brunei",
                "Thailand",
                "Jepang",
                "Irak",
                "Jerman",
                "Inggris",
                "Amerika",
                "India",
        };

        listviewCountry = findViewById(R.id.lv_negara);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                countryArr);
        listviewCountry.setAdapter(adapter);
        listviewCountry.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), countryArr[i], Toast.LENGTH_SHORT).show();
            }
        });

    }
}