package com.example.biodataact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activity_biodata extends AppCompatActivity {
    public static String getData = "data";
    TextView viewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        viewData = (TextView)findViewById(R.id.tvView);
        biodata source = getIntent().getParcelableExtra(getData);
        String text = "NIM : "+source.getNim()+" Nama : "+source.getNama()+" Kelas : "+source.getKelas()+" Tanggal : "+source.getTgl();
        viewData.setText(text);

    }
}
