package com.aman;

import java.util.Scanner;

public class Q26_DisplayPrimeNumBetweenTwoTerminals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the interval between which you want to find the prime numbers: ");
        System.out.println("Enter the 1st interval: ");
        int num1 = scan.nextInt();
        System.out.println("ENter the second interval: ");
        int num2 = scan.nextInt();
        boolean prime = false;
        for (int num = num1; num <= num2; num++) {
            if(num==2){
                prime=true;
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                } else {
                    prime = true;
                }
            }
            if (prime == true) {
                System.out.println(num + " is a Prime Number");
            }
        }


    }
}

