package com.springinaction.springidol.impl;

import com.springinaction.springidol.Instrument;
import com.springinaction.springidol.StringedInstrument;

@StringedInstrument
public class GuitarImpl implements Instrument {

    @Override
    public void play() {
        System.out.println("Playing the guitar!");
    }
}
