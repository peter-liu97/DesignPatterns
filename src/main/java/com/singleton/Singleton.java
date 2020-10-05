package com.singleton;

/**
 * 单例模式: 保证内存中只有一个实例
 *
 * 饿汉式
 * 懒汉式
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){};

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
