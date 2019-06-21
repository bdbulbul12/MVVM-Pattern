package com.example.mvvpvproject.viewmodel;

import android.arch.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    public String  additionFunction(String value1,String value2){

            int num1=Integer.parseInt(value1);
            int num2 = Integer.parseInt(value2);

            int result = num1+num2;

            return  String.valueOf(result);


    }


}
