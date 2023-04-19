package com.aman;

import java.util.Scanner;

public class Q31_FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This Program finds all the factors of number you enter : " );
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        System.out.println("Factors of "+num+" : ");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" , ");
            }
        }
    }
}
