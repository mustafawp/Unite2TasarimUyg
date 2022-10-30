package com.example.unite2_ekrantasarimi;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class uygulama9activity extends AppCompatActivity {
    Button sa;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.uygulama9);
        sa = (Button) findViewById(R.id.buttonuyg);
        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent son = new Intent(uygulama9activity.this,uygulama10activity.class);
                startActivity(son);
            }
        });
    }
}
