package com.team8.demo_app_gradle;

import android.app.Application;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setNightMode();
    }

    //设置黑夜模式
    public void setNightMode(){
        setTheme(R.style.DayNight);
    }
}
