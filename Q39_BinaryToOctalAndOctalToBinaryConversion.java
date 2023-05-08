package com.aman;

import java.util.Scanner;

public class Q39_BinaryToOctalAndOctalToBinaryConversion {
    static int anyOtherFormToDecimal(int otherFormNum , int base){
        int decimal_num = 0;
        for(int i=0; otherFormNum > 0;i++){
            int remainder = otherFormNum % 10;
            decimal_num = (int) (decimal_num + (remainder * Math.pow(base, i)));
            otherFormNum = otherFormNum / 10;
        }
        return decimal_num;
    }
    static String decimalToAnyOtherForm(int decimal_num , int base){
        String otherFormNum = "";
        while(decimal_num > 0){
            int remainder = decimal_num % base;
            int quotient = decimal_num / base;
            otherFormNum = remainder + otherFormNum;
            decimal_num = quotient;

        }
        return otherFormNum;
    }
    static int binaryToAnyOtherForm(int binary_num , int base){
        int otherFormNum =0;
            int otherFormNumToDecimalNum = anyOtherFormToDecimal(binary_num,2);
//            String otherFormNum = Integer.toString(otherFormNum);
            otherFormNum = Integer.parseInt(decimalToAnyOtherForm(otherFormNumToDecimalNum,base));

        return otherFormNum;
    }

    public static void main(String[] args) {
        System.out.println(binaryToAnyOtherForm(1101,8));
    }
}
