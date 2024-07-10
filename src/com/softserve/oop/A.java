package com.softserve.oop;

public class A {
    private int i = 321;
    public double j = 2.5;

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

    public double getJ() {
        return j;
    }

    public void m1() {
        System.out.println("m1() from A, j =" + j);
    }

    public void m2() {
        System.out.println("m2() from A, j =" + j);
    }

    public void m3() {
        System.out.print("m3() from A, running m4() ... ");
        m4();
    }

    public void m4() {
        System.out.println("m4() from A, j =" + j);
    }
}
