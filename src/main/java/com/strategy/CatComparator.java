package com.strategy;

public class CatComparator implements Comparator<Cat>{
    public int compare(Cat o1, Cat o2) {
        if (o1.getW() < o2.getW()) return  -1;
        else if(o1.getW() > o2.getW()) return 1;
        else return 0;
    }
}
