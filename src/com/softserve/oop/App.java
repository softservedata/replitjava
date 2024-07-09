package com.softserve.oop;

import com.softserve.edu.Appl;

public class App {
    private int i = 1;

//    public App(int i) {
//        this.i = i;
//    }

    @Override
    public String toString() {
        return "Class = App {" +
                "i = " + i +
                '}';
    }

    public void printI() {
        System.out.println("printI() i = " + i);
        printStatic();
    }

    public static void printStatic() {
        System.out.println("\tprintStatic()");
    }

    public static void main(String[] args) {
        System.out.println("start");
        App app = new App();
        System.out.println("printI() i = " + app.i);
        app.i = 234;
        App app2 = new App();
        app2.i = 456;
        app.printI();
        app2.printI();
        //
        Appl appl = new Appl();
        appl.id = 1;
        //
        System.out.println("app2 = " + app2.toString()); // .toString()
    }
}
