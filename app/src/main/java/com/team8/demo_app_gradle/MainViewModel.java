package com.team8.demo_app_gradle;

import android.annotation.SuppressLint;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.team8.demo_app_gradle.databinding.ActivityMainBinding;

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
}
