package com.medklik.medklik.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.medklik.medklik.R;

public class KodeVerifikasiActivity extends AppCompatActivity {
    Button btn_kirim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode_verifikasi);

        btn_kirim = findViewById(R.id.btn_kirim);
        btn_kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KodeVerifikasiActivity.this, LoginPenggunaActivity.class);
                startActivity(intent);
            }
        });
    }
}