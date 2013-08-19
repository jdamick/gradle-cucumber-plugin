/**
 * Copyright 2013 Jeffrey Damick. All rights reserved.
 */

package com.damick;

public class Cucurbitaceae {
    private boolean pickled = false;

    public void pickle() {
        pickle(true);
    }

    public void pickle(boolean toPickleOrNotToPickle) {
        pickled = toPickleOrNotToPickle;
    }

    public boolean isPickled() {
        return pickled;
    }
}
