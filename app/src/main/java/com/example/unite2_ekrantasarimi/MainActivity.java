package com.example.unite2_ekrantasarimi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sonrakiuyg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama3);

        sonrakiuyg = (Button) findViewById(R.id.button);
        sonrakiuyg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sonrakiuyg = new Intent(MainActivity.this, uygulama4activity.class);
                startActivity(sonrakiuyg);
            }
        });
    }
}