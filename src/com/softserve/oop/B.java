package com.softserve.oop;

public class B extends A {

    public int j;

    public B() {
        j = 789;
        System.out.println("\t\tpublic B() done");
    }

    public B(int j) {
        super(213);
        this.j = j;
        System.out.println("\t\tpublic B(int j) done");
    }

    public void m1() {
        System.out.print("m1() from B.\t\t");
        super.m1();
    }

}
