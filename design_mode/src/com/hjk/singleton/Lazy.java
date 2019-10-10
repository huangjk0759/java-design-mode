package com.hjk.singleton;

/**
 * @author hjk
 * 2019/10/10 - 22:15
 * 懒汉
 */
public class Lazy {
    private static Lazy instance;

    private Lazy() {
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("对象已经初始化!!");
        }

    }

    public static synchronized Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }


}
