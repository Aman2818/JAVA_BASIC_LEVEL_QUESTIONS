package com.aman;

import java.util.Scanner;

public class Q34_SumOfNaturalNumUptoEnteredNumUsingRecursion {
    static int sumOfNaturalNum(int num){
        int sum = 0;
        if(num==0){
            sum=num;
        }
        else {
            sum = num + sumOfNaturalNum(num-1);
        }
        return sum ;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Natural number : ");
        int naturalNum = scan.nextInt();
        System.out.printf("Sum of all natural num upto %d : ",naturalNum);
        System.out.println(sumOfNaturalNum(naturalNum));

    }
}
