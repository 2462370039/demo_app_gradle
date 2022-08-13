package com.team8.demo_app_gradle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.team8.demo_app_gradle.databinding.ActivityMainBinding;
import com.team8.demo_app_gradle.test.LiveDataActivity;

public class MainViewModel extends AndroidViewModel {
    private  static ActivityMainBinding binding;
    @SuppressLint("StaticFieldLeak")
    private static MainActivity mainActivity;
    public MainViewModel(@NonNull Application application){
        super(application);
    }


    public static void setBinding(ActivityMainBinding binding, MainActivity mainActivity) {
        //把binding和mainActivity都赋值给MainVM作为静态变量备用，因为很多绑定的控件都只能用静态方法
        MainViewModel.binding = binding;
        MainViewModel.mainActivity = mainActivity;
    }

    public static void click(View view){
        //点击事件
        Toast.makeText(mainActivity, "你点击了按钮", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent();
        intent.setClass(mainActivity, LiveDataActivity.class);
        mainActivity.startActivity(intent);
    }
}
