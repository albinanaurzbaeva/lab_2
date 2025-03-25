package com.example.rmp_lab_2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

public class BaseFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Здесь можно добавить общий код для всех фрагментов
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        // Здесь можно добавить общий код для всех фрагментов
    }
}