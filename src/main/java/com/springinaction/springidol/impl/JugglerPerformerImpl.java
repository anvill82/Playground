package com.springinaction.springidol.impl;

import com.springinaction.springidol.Performer;

public class JugglerPerformerImpl implements Performer {
    private int beanBags = 3;

    public JugglerPerformerImpl() {
    }

    public JugglerPerformerImpl(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() {
        System.out.println("Juggling " + beanBags + " Balls");
    }
}
