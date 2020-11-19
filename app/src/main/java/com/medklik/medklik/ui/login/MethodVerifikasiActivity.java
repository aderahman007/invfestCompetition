package com.medklik.medklik.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.medklik.medklik.R;

public class MethodVerifikasiActivity extends AppCompatActivity {

    LinearLayout btn_sms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_verifikasi);

        btn_sms = findViewById(R.id.btn_sms);
        btn_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MethodVerifikasiActivity.this, KodeVerifikasiActivity.class);
                startActivity(intent);
            }
        });
    }
}