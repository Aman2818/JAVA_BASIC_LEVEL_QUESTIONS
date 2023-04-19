package com.aman;

import java.util.Scanner;

public class Q21_CountNumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Integer of which you want to count the number of digits: ");
        int num = scan.nextInt();
        int count_num=0;
        while(num!=0){
            num=num/10;
            count_num++;
        }
        System.out.println("Number of digits in the entered integer: "+ count_num);
    }
}
