package com.aman;

import java.util.Scanner;

public class Q42_CalculateAverageUsingArrays {
    static float AverageOfArray(float[] arr){
        float average = 0;
        float sum = 0;
        for(float i : arr){
            sum = sum + i;
        }
        average = sum / arr.length;
        return average;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total number of integer you want average of");
        int numOfInt = scan.nextInt();
        float [] arr = new float[numOfInt];
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Average of numbers in array: ");
        System.out.println(AverageOfArray(arr));

    }
}
