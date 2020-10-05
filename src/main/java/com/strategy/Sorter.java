package com.strategy;

public class Sorter<T> {

    public void sort(T[] ts, Comparator comparator){
        int length = ts.length;
        for (int i = 0; i < length; i++) {
            for (int j =i;j < length-1; j++) {
                if (comparator.compare(ts[j],ts[j+1])<0) {
                    T t = ts[j+1];
                   ts[j+1]=ts[j];
                   ts[j] = t;
                }
            }
        }
    }
}
