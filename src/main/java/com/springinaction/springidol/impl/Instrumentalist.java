package com.springinaction.springidol.impl;

import com.springinaction.springidol.Instrument;
import com.springinaction.springidol.Performer;

public class Instrumentalist implements Performer, Instrument {
    public Instrumentalist() {
    }

    private String song;

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }

    private Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        System.out.println("Playing... " + song + " : ");
        instrument.play();
    }

    @Override
    public void play() {

    }
}
