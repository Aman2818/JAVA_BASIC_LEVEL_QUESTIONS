package com.aman;

import java.util.Scanner;

public class Q22_ReverseTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = scan.nextInt();
        int reverse_num=0;
        while(num!=0){
            int rem = num%10;
            num=num/10;
            reverse_num=reverse_num*10+rem;
        }
        System.out.println("Reverse of Entered num : "+reverse_num);

    }
}
