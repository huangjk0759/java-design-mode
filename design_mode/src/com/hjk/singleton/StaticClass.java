package com.hjk.singleton;

import java.lang.reflect.Constructor;

/**
 * @author hjk
 * 2019/10/10 - 22:19
 * 静态内部类
 */
public class StaticClass {
    private static StaticClass instance = null;

    private StaticClass() {
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("对象已经初始化!!");
        }
    }

    private static class InnerClass {
        private static final StaticClass STATICCLASS = new StaticClass();
    }

    static StaticClass getInstance() {
        return instance = StaticClass.InnerClass.STATICCLASS;
    }


}
