package com.hjk.singleton;

/**
 * @author hjk
 * 2019/10/10 - 22:11
 * 饿汉式
 */
public class Eager {
    private static  Eager eager = new Eager();

    private Eager(){}

    private static Eager getInstance() {
        return eager;
    }


}
