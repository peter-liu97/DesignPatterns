package com.singleton;

/**
 * 单例模式: 保证内存中只有一个实例
 *
 * 饿汉式
 * 懒汉式
 */
public class Singleton2 {

    private static class SingletonHolder{
        private static final Singleton2 INSTANCE = new Singleton2();

    }

    private Singleton2(){};

    public static Singleton2 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
