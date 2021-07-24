package com.example.uasMuhammadgesang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DaftarActivity extends AppCompatActivity {
  Button back, daftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        back = findViewById(R.id.btnbdaftar);
        daftar = findViewById(R.id.btndaftar);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.uasMuhammadgesang.DaftarActivity, getStarted.class);
                startActivity(intent);
            }
        });
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.uasMuhammadgesang.DaftarActivity, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}