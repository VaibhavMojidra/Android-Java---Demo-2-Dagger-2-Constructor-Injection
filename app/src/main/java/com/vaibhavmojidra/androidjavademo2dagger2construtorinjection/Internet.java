package com.vaibhavmojidra.androidjavademo2dagger2construtorinjection;

import android.util.Log;

import javax.inject.Inject;

public class Internet {

    @Inject
    public Internet() {
        Log.i("MyTag","Internet class has been initialized.");
    }

    void isInternetAvailable(){
        Log.i("MyTag","Internet is available.");
    }
}
