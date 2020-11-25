package com.medklik.medklik_user;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.medklik.medklik_user.fragment.HomeFragment;
import com.medklik.medklik_user.fragment.KartuFragment;
import com.medklik.medklik_user.fragment.KeranjangFragment;
import com.medklik.medklik_user.fragment.ObrolanFragment;
import com.medklik.medklik_user.fragment.ProfilFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFragment(new HomeFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.obrolan:
                        fragment = new ObrolanFragment();
                        break;
                    case R.id.kartu:
                        fragment = new KartuFragment();
                        break;
                    case R.id.keranjang:
                        fragment = new KeranjangFragment();
                        break;
                    case R.id.profil:
                        fragment = new ProfilFragment();
                        break;
                }
                return getFragment(fragment);
            }
        });
    }

    private boolean getFragment(Fragment fragment) {
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}