package com.strategy;

public class Cat {
    private int  w ;
    private int  h ;

    public Cat(int w) {
        this.w = w;
    }

    public Cat(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "w=" + w +
                ", h=" + h +
                '}';
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
