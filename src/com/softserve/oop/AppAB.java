package com.softserve.oop;

public class AppAB {

    public static void main(String[] args) {
        //B b = new B();
        //System.out.println("i = " + b.getI());
        //
        A a = new B();
        System.out.println("a.j = " + a.j); // from A
        System.out.println("a.getJ() = " + a.getJ()); // from A
        a.m1();
        a.m2(); // From A
        a.m3(); // m4 from B
        a.m4(); // from B
    }
}
