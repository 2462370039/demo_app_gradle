package com.team8.demo_app_gradle.test;

import com.team8.demo_app_gradle.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * @introduction: 学习LiveData用 Activity
 * @author: T19
 * @time: 2022.08.13 15:57
 */
public class LiveDataActivity extends AppCompatActivity {

    LiveDataViewModel liveDataViewModel;

    TextView textView;
    ImageButton imageButton_film, imageButton_tv, imageButton_variety;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data);
        textView = findViewById(R.id.textView);
        imageButton_film = findViewById(R.id.imageButton_film);
        imageButton_tv = findViewById(R.id.imageButton_tv);
        imageButton_variety = findViewById(R.id.imageButton_variety);

        liveDataViewModel = ViewModelProviders.of(this).get(LiveDataViewModel.class);
        //为ViewModel下数据添加观察
        liveDataViewModel.getTestNumber().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                textView.setText(String.valueOf(integer));
            }
        });
        //为film按钮绑定监听事件
        imageButton_film.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liveDataViewModel.addTestNumber(1);
            }
        });
        //为tv按钮绑定监听事件
        imageButton_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liveDataViewModel.addTestNumber(2);
            }
        });
        //为variety按钮绑定监听事件
        imageButton_variety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liveDataViewModel.addTestNumber(3);
            }
        });

    }
}