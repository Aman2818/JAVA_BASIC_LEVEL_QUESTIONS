package com.aman;

import java.util.Scanner;

public class Q37_ConvertBinaryToDecimalAndViceVersa {
    static int binaryToDecimal(int binary_num){
        int decimal_num=0;
        int count = 0;

        while(binary_num!=0){
            int rem = binary_num%10;
            binary_num=binary_num/10;
            count++;
            decimal_num= (int) (decimal_num + rem * Math.pow(2,count-1));
        }
        return decimal_num;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Binary ");
        System.out.println(binaryToDecimal(1011));
    }
}
