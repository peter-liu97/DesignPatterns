package com.strategy;

public class Test {

    public static void main(String[] args) {
        Cat[] cats ={new Cat(2,2),new Cat(4,4),new Cat(1,1)};

        Sorter<Cat> catSorter = new Sorter<Cat>();
        catSorter.sort(cats , new CatComparator());
        int length = cats.length;
        for (int i = 0; i < length; i++) {
            System.out.println(cats[i]);
        }
        System.out.println("test");
        System.out.println("test");
    }
}
