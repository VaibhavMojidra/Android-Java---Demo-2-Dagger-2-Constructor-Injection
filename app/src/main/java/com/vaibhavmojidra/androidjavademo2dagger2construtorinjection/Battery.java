package com.vaibhavmojidra.androidjavademo2dagger2construtorinjection;

import android.util.Log;

import javax.inject.Inject;

public class Battery {

    @Inject
    public Battery() {
        Log.i("MyTag","Battery class has been initialized.");
    }

    void isBatteryCharged(){
        Log.i("MyTag","Battery is fully charged.");
    }
}
