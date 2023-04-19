package com.aman;

public class Q23_PowerOfNum {
    static int power(int num , int power_num){
        int result=1;
        for(int i=1;i<=power_num;i++){
            result = result*num;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(power(5,1));
    }
}
