package com.aman;

import java.util.Scanner;

public class Q37_ConvertBinaryToDecimalAndViceVersaMySolution {
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

    static String decimalToBinary(int decimal_num){
        String binary_num = "";
        String final_binary_num="";
        String temp_string="";
        while(decimal_num>1){
            int rem = decimal_num % 2;
            decimal_num = decimal_num / 2 ;
            temp_string = String.valueOf(rem);
            binary_num = binary_num.concat(temp_string);
            if (decimal_num == 1) {
                binary_num = binary_num.concat("1");
            }
            }
            for(int i=binary_num.length()-1; i>=0; i--){
                char c = binary_num.charAt(i);
                final_binary_num = final_binary_num+c;
        }
        return final_binary_num;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Decimal Number: ");
        int decimal_num = scan.nextInt();
        System.out.println("Binary form of "+decimal_num+" "+decimalToBinary(decimal_num));

        System.out.println("Enter a Binary number: ");
        int binary_num = scan.nextInt();
        System.out.println(binaryToDecimal(binary_num));


    }
}
