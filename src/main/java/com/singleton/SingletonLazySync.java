package com.singleton;

public class SingletonLazySync {
    // volatile
    private static volatile SingletonLazySync INSTANCE;

    private SingletonLazySync(){}

    /**
     * 执行 INSTANCE =new SingletonLazySync();虚拟机执行了以下三布操作
     * 1,分配一片内存空间
     * 2,对象的初始化
     * 3,INSTANCE指向内存地址
     *
     * 如果第二部执行时间比较久,那么虚拟机可能会对以上三条指令进行重排序,可能将
     * 第三条指令放在第二条上面执行这种情况在单线程下不影响,但在多线程去情况下,
     * 当第一条线程执行执行完执行内存操作,尚未执行初始化操作,这时第二条线程访问INSTANCE == null
     * 会返回false,会得到一个尚未初始化的对象的内存地址,
     *
     * @return
     */
    public static SingletonLazySync getInstance(){
            synchronized (SingletonLazySync.class) {
                if (INSTANCE == null) {
                    synchronized (SingletonLazySync.class){
                        if (INSTANCE == null){
                            INSTANCE = new SingletonLazySync();
                        }
                    }
                }
            }
        return INSTANCE;
    }
}
