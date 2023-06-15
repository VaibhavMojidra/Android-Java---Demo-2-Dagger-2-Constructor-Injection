package com.vaibhavmojidra.androidjavademo2dagger2construtorinjection;

import android.util.Log;

import javax.inject.Inject;

public class PlayGame {

    private Internet internet;
    private SmartPhone smartPhone;
    private Game game;

    @Inject
    public PlayGame(Internet internet, SmartPhone smartPhone, Game game) {
        this.internet = internet;
        this.smartPhone = smartPhone;
        this.game = game;
        Log.i("MyTag","PlayGame class has been initialized.");
    }

    void playGame(){
        internet.isInternetAvailable();
        smartPhone.isSmartPhoneAvailableAndFullyCharged();
        game.isDGameDownloaded();
        Log.i("MyTag","Ready to play game.");
    }
}
