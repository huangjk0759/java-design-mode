package com.hjk.singleton;

/**
 * @author hjk
 * 2019/10/10 - 22:30
 * 双重检测锁
 */
public class DoubleLock {
    /**
     * 加volatile关键字,防止内存无序写入,保证写入时,先读取主内存中最新资源
     */
    private volatile static DoubleLock doubleLock = null;

    private DoubleLock() {
    }

    /**
     * 双重检查锁定的问题是：并不能保证它会在单处理器或多处理器计算机上顺利运行。
     * 双重检查锁定失败的问题并不归咎于 JVM 中的实现 bug，
     * 而是归咎于 Java 平台内存模型。内存模型允许所谓的“无序写入”，这也是这些习语失败的一个主要原因。
     * @return
     */
    public DoubleLock getInstance() {
        if (doubleLock == null) {
            synchronized (this) {
                if (doubleLock == null) {
                    return doubleLock = new DoubleLock();
                }
            }
        }
        return doubleLock;
    }

}
