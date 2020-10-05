package com.singleton;

/**
 * 不仅可以解决线程同步,还能防止反序列化
 */
public enum  EnumSingleton {
    INSTANCE;
    public void m(){
    }
}
