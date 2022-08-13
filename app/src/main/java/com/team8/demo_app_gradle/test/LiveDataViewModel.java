package com.team8.demo_app_gradle.test;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @introduction: 学习LiveData用 ViewModel
 * @author: T19
 * @time: 2022.08.13 15:57
 */
public class LiveDataViewModel extends ViewModel {
    //计数器 (测试用)
    private MutableLiveData<Integer> testNumber;

    public MutableLiveData<Integer> getTestNumber() {
        if (testNumber == null) {
            testNumber = new MutableLiveData<>();
            testNumber.setValue(0);
        }
        return testNumber;
    }

    //改变 testNumber 的值
    /*public void ChangeTestNumber(int n){
        if (n == 1) {
            testNumber.setValue("抖音电影榜单");
        }
        else if (n == 2) {
            testNumber.setValue("抖音剧集榜");
        }
        else if (n == 3) {
            testNumber.setValue("抖音综艺榜");
        }
    }*/

    public void addTestNumber(int n){
        testNumber.setValue(testNumber.getValue() + n);
    }
}
