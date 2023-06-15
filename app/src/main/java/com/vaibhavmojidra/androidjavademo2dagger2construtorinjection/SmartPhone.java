package com.vaibhavmojidra.androidjavademo2dagger2construtorinjection;

import android.util.Log;

import javax.inject.Inject;

public class SmartPhone {

    private Battery battery;

    @Inject
    public SmartPhone(Battery battery) {
        this.battery = battery;
        Log.i("MyTag","SmartPhone class has been initialized.");
    }

    void isSmartPhoneAvailableAndFullyCharged(){
        Log.i("MyTag","Smartphone is available.");
        battery.isBatteryCharged();
    }
}
