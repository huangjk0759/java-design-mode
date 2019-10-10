package com.hjk.singleton;

/**
 * @author hjk
 * 2019/10/10 - 22:19
 * 静态内部类
 */
public class StaticClass {

    private static class InnerClass {
        private static StaticClass staticClass = new StaticClass();
    }

    public static StaticClass getInstance() {
        return InnerClass.staticClass;
    }


}
