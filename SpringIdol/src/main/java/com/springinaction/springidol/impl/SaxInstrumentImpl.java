package com.springinaction.springidol.impl;

import com.springinaction.springidol.Instrument;

public class SaxInstrumentImpl implements Instrument {
    @Override
    public void play() {
        System.out.println("Playing the sax!");
    }
}
