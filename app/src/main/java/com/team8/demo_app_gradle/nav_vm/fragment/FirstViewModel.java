package com.team8.demo_app_gradle.nav_vm.fragment;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FirstViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<Integer> number;

    public MutableLiveData<Integer> getNumber() {
        if (number == null) {
            number = new MutableLiveData<>();
            number.setValue(0);
        }
        return number;
    }

    public void add(int n){
        number.setValue(number.getValue() + n);
        if (number.getValue() < 0) {
            number.setValue(0);
        }else if (number.getValue() > 100) {
            number.setValue(100);
        }
    }
}