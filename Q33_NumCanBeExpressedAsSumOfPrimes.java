package com.aman;

import java.util.Scanner;

public class Q33_NumCanBeExpressedAsSumOfPrimes {

    static boolean isPrime(int num){
        boolean prime = false;
        for(int i=2; i<num; i++){
            if(num % i == 0){
                prime = false;
                break;
        }
            else{
                prime = true;
        }
    }
    return prime ;
}
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            boolean flag = false;
            int num = scan.nextInt();
            for(int i = 0; i <= num/2; i++ ){
                if(isPrime(i)){
                    if(isPrime((num-i))) {
                        System.out.println(num + " can be expressed as " + i + "+" + (num - i));
                        flag = true;
                    }
                }
            }
            if(flag == false){
                System.out.println(num +" cannot be expressed as sum of primes");
            }



        }
}

