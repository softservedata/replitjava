package com.softserve.oop;

public class B extends A {

    public int j = 9;

    public B() {
        //j = 789;
        System.out.println("\t\tpublic B() done");
    }

    public B(int j) {
        super(213);
        this.j = j;
        System.out.println("\t\tpublic B(int j) done");
    }

    public double getJ() {
        return j;
    }

    @Override
    public void m1() {
        System.out.println("m1() from B, j = " + j);
        //super.m1();
    }

    @Override
    public void m4() {
        System.out.println("m4() from B, j =" + j);
    }
}
