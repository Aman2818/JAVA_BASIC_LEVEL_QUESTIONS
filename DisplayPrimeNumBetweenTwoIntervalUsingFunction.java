package com.aman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayPrimeNumBetweenTwoIntervalUsingFunction {
    static void primeNumBetweenTwoInterval(int interval_1 , int interval_2) {
        List<Integer> arrayListToStoresPrimes = new ArrayList<Integer>(10);
        boolean prime = false;
        int countOfPrimes = 0;
        for (int i = interval_1; i <= interval_2; i++) {

            if(i==2){
                prime=true;
            }
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    prime=false;
                    break;
                }
                else{
                    prime = true;
                    countOfPrimes++;
                    break;
                }
            }
            if(prime==true){
                for(int k=0 ; k<countOfPrimes;k++){
                    arrayListToStoresPrimes.add(i);
                }
            }
        }
        System.out.println(arrayListToStoresPrimes);
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the first interval: ");
        int interval_1 = scan.nextInt();
        System.out.println("Enter the second interval : ");
        int interval_2 = scan.nextInt();

        primeNumBetweenTwoInterval(interval_1,interval_2);

    }
}
