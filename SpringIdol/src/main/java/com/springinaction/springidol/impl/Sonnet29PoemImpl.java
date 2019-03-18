package com.springinaction.springidol.impl;

import com.springinaction.springidol.Poem;

public class Sonnet29PoemImpl implements Poem {

    private static String[] LINES = {
            "When, in disgrace with fortune and men's eyes,",
            "I all alone beweep my outcast state"
    };

    @Override
    public void recite() {
        for (int i = 0; i < LINES.length; i++) {
            System.out.println(LINES[i]);
        }
    }
}
