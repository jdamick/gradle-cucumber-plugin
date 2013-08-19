/**
 * Copyright 2013 Jeffrey Damick. All rights reserved.
 */

package com.damick;

public class PickleJar {
    private Cucurbitaceae cuke;

    public boolean isEmpty() {
        return cuke == null;
    }

    public void add(Cucurbitaceae cuke) {
        this.cuke = cuke;
    }

    public Cucurbitaceae remove() {
        cuke.pickle();
        Cucurbitaceae result = cuke;
        cuke = null;
        return result;
    }
}
