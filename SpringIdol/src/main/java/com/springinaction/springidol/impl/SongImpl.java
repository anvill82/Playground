package com.springinaction.springidol.impl;

import com.springinaction.springidol.Song;
import org.springframework.beans.factory.annotation.Value;

public class SongImpl implements Song {

    @Value("${song.name}")
    private String song;

    @Override
    public void sing() {
        System.out.println("Singing " + song);
    }
}
