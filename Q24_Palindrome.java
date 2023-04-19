package com.aman;

import java.util.Scanner;

public class Q24_Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();
        int reverse_num=0;
        int container_num = num;
        while(num!=0){
            int rem = num % 10;
            reverse_num = reverse_num * 10 + rem;
            num = num/10;
        }
//        System.out.println(reverse_num);
        if(reverse_num==container_num){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
