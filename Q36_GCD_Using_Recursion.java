package com.aman;

import java.util.Scanner;

public class Q36_GCD_Using_Recursion {
    static int hcfOfTwoNum(int num1 , int num2){
        int max , min ,hcf ;
        if(num1 > num2){
            max = num1;
            min = num2;
        }
        else{
            max = num2;
            min = num1;
        }
        if(min != 0){
            hcf = hcfOfTwoNum(max, max % min);
        }
        else{
            hcf=1;
        }
        return hcf;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int num1 = scan.nextInt();
        System.out.println("Enter second Number : ");
        int num2 = scan.nextInt();

        System.out.printf("H.C.F of (%d,%d) is %d",num1,num2,hcfOfTwoNum(num1,num2));

    }
}
