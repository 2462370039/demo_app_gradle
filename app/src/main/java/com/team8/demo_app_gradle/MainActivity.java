package com.team8.demo_app_gradle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.team8.demo_app_gradle.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //获取布局绑定实例
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //获取ViewModel实例
        MainViewModel vm = new ViewModelProvider(this, new ViewModelProvider.AndroidViewModelFactory(getApplication())).get(MainViewModel.class);
        //绑定
        binding.setVm(vm);
        //设置ViewModel所使用的生命周期
        binding.setLifecycleOwner(this);
        /**
         *因为在VM中我们可能要用到MainActivity弹Toast什么的，因此需要传一个this
         * 因为若涉及到适配器列表等控件、以及数据绑定则需要在VM中用到binding
         * 因此VM中的setBinding，我把他当作初始化函数使用更方便！
         */
        vm.setBinding(binding, this);
    }
}