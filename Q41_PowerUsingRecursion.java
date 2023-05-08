package com.aman;

import java.util.Scanner;

public class Q41_PowerUsingRecursion {
    static int power(int num , int pow){
        int p=0;
        if(pow==0){
            p = 1;
        }
        else{
            p = num  * power(num , pow - 1);
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        System.out.println("Enter the Power of Num : ");
        int pow = scan.nextInt();
        System.out.printf("%d ^ %d = %d",num,pow,power(num,pow));


    }
}
