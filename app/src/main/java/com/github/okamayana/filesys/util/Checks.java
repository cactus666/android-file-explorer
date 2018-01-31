package com.github.okamayana.filesys.util;

/**
 * Created by odhita_kamayana on 1/29/2018.
 */

public final class Checks {

    private Checks() {
    }

    public static <T> T checkNotNull(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        return t;
    }
}
