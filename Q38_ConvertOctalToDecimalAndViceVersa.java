package com.aman;

import java.util.Scanner;

public class Q38_ConvertOctalToDecimalAndViceVersa {
    static String decimalToOctal(int decimal_num){
        String octal_num = "";
        while(decimal_num > 0){
            int remainder = decimal_num % 8;
            int quotient = decimal_num / 8;
            octal_num = remainder + octal_num;
            decimal_num = quotient;
        }
        return octal_num;
    }

    static int octalToDecimal(int octal_num){
        int decimal_num =0;
        for(int i=0; octal_num > 0; i++){
            int remainder = octal_num % 10;
            decimal_num = (int) (decimal_num + (remainder * Math.pow(8,i)));
            octal_num = octal_num / 10;
        }
        return decimal_num;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int decimal_num = scan.nextInt();

        System.out.println("Octal Form: ");
        System.out.println(decimalToOctal(decimal_num));


        System.out.println("Enter the octal number: ");
        int octal_num2 = scan.nextInt();

        System.out.println("decimal Form: ");
        System.out.println(octalToDecimal(octal_num2));
    }
}
