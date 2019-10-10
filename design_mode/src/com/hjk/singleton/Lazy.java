package com.hjk.singleton;

/**
 * @author hjk
 * 2019/10/10 - 22:15
 * 懒汉
 */
public class Lazy {
    private static Lazy lazy = null;

    private Lazy() {

    }

    public static Lazy getInstance() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }



}
