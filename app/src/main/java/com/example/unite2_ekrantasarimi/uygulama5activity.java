package com.example.unite2_ekrantasarimi;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class uygulama5activity extends AppCompatActivity {

    Button butona;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.uygulama5);

        butona = (Button) findViewById(R.id.sonrakiuyg);
        butona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sonrakiuyg = new Intent(uygulama5activity.this,uygulama8activity.class);
                startActivity(sonrakiuyg);
            }
        });
    }
}
