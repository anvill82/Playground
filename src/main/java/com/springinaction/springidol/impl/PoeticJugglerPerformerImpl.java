package com.springinaction.springidol.impl;

import com.springinaction.springidol.Poem;

public class PoeticJugglerPerformerImpl extends JugglerPerformerImpl {
    private Poem poem;

    public PoeticJugglerPerformerImpl(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJugglerPerformerImpl(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() {
        super.perform();
        System.out.println("While reciting... ");
        poem.recite();
    }
}
