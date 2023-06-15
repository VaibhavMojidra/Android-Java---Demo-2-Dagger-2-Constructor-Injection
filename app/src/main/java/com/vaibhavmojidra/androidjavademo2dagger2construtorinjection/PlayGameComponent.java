package com.vaibhavmojidra.androidjavademo2dagger2construtorinjection;

import dagger.Component;

@Component
public interface PlayGameComponent {
    public PlayGame startGame();
}
