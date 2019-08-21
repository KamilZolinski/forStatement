package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i=2; i<=8;i++) {
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0,i)));
        }
        System.out.println("*************");
        for (int i=8; i>=2;i--) {
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0,i)));
        }
        System.out.println("****************************************************");
        int numberOfPrime = 0;
        for (int i=10;i<50;i++) {
            if (isPrime(i)) {
                numberOfPrime++;
                System.out.println("num " + i);

                if (numberOfPrime == 3) {
                    break;
                }
            }
        }

    }
    public static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }
            for (int i=2;i<=n/2;i++) {
                if(n%i==0) {
                 return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount *(interestRate/100));
    }
}
