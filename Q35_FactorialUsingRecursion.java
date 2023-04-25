package com.aman;

import java.util.Scanner;

public class Q35_FactorialUsingRecursion {
    static int factorial(int num){
        int factOfNum;
        if(num==0){
            factOfNum=1;
        }
        else {
            factOfNum = num * factorial(num -1);
        }
        return factOfNum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num whose factorial you want to find: ");
        int findFactorialOf = scan.nextInt();
//        int f = factorial(5);
        System.out.printf("Factorial of %d is : ",findFactorialOf);
        System.out.println(factorial(findFactorialOf));

    }
}
