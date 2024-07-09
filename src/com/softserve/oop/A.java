package com.softserve.oop;

public class A {
    private int i = 321;

    public A(int i) {
        this.i = i;
    }

    public A() {
        i = 567;
        System.out.println("\tpublic A() done");
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void m1() {
        System.out.println("m1() from A.");
    }

}
