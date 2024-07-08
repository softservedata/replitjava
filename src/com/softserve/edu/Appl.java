package com.softserve.edu;

import java.util.Scanner;

class Appl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency rate");
        double currency = sc.nextDouble();
        System.out.println("Enter amount of money");
        int hryvna = sc.nextInt();
        int amount = (int) (hryvna / currency);
        System.out.println("You can byu " + amount + "$");
        sc.close();
    }

}
