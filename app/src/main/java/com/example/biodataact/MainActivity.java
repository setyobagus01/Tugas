package com.example.biodataact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nim, nm, kls, tgl;
    Button simpan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nim = (EditText)findViewById(R.id.etnim);
        nm = (EditText)findViewById(R.id.etnm);
        kls = (EditText)findViewById(R.id.etkls);
        tgl = (EditText)findViewById(R.id.ettgl);
        simpan = (Button)findViewById(R.id.btsimpan);

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = String.valueOf(nim.getText());
                String b = String.valueOf(nm.getText());
                String c = String.valueOf(kls.getText());
                String d = String.valueOf(tgl.getText());

                biodata source = new biodata();
                source.setNim(a);
                source.setNama(b);
                source.setKelas(c);
                source.setTgl(d);
                Intent movedata = new Intent(MainActivity.this, activity_biodata.class);
                movedata.putExtra(activity_biodata.getData, source);
                startActivity(movedata);
            }
        });

    }
}
