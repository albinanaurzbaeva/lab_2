package com.example.rmp_lab_2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SecondFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        // Кнопка для перехода в ThirdFragment
        Button buttonOpenThird = view.findViewById(R.id.button_open_third);
        buttonOpenThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThirdFragment thirdFragment = new ThirdFragment();
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, thirdFragment)
                        .addToBackStack(null) // Добавляем транзакцию в бэкстек
                        .commit();
            }
        });

        return view;
    }
}