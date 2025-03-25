package com.example.rmp_lab_2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Здесь можно добавить общий код для всех активити
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Здесь можно добавить общий код для всех активити
    }
}