package com.vaibhavmojidra.androidjavademo2dagger2construtorinjection;

import android.util.Log;

import javax.inject.Inject;

public class Game {

    @Inject
    public Game() {
        Log.i("MyTag","Game class has been initialized.");
    }

    void isDGameDownloaded(){
        Log.i("MyTag","Game is already downloaded.");
    }
}
