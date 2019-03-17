package com.springinaction.springidol.impl;

import com.springinaction.springidol.Instrument;
import com.springinaction.springidol.Performer;

import java.util.Collection;

public class OneManBandPerformerImpl implements Performer {

    private Collection<Instrument> instruments;

    public OneManBandPerformerImpl() {
    }

    @Override
    public void perform() {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}
