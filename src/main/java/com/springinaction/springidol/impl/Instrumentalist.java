package com.springinaction.springidol.impl;

import com.springinaction.springidol.Instrument;
import com.springinaction.springidol.Performer;
import com.springinaction.springidol.Song;
import com.springinaction.springidol.StringedInstrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instrumentalist implements Performer, Instrument {
    public Instrumentalist() {
    }

    @Autowired(required = false)
    private Song song;

//    @StringedInstrument
    @Autowired(required = false)
    private Instrument instrument;



    @Override
    public void perform() {
        song.sing();
        instrument.play();
    }

    @Override
    public void play() {
    }
}
