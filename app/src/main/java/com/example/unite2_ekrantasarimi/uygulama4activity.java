package com.example.unite2_ekrantasarimi;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class uygulama4activity extends AppCompatActivity {

    Button buton;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.uygulama4);

        buton = (Button) findViewById(R.id.btnsonraki);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent digersayfa = new Intent(uygulama4activity.this, uygulama5activity.class);
            }
        });
    }
}
