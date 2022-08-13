package com.team8.demo_app_gradle.list;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.team8.demo_app_gradle.databinding.ActivityMainBinding;

/**
 * @introduction:
 * @author: T19
 * @time: 2022.08.13 12:04
 */
public class List_optionsViewModel extends AndroidViewModel {
    private static ActivityMainBinding binding;

    public List_optionsViewModel(@NonNull Application application) {
        super(application);
    }
}
