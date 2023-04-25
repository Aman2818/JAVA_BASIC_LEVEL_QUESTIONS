package com.aman;

import java.util.Scanner;

public class Q18_GCDofTwoNUM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int firstNum = scan.nextInt();
        System.out.println("Enter second number : ");
        int secondNum = scan.nextInt();

        int max , min , GCD = 0;

        if(firstNum > secondNum){
            max = firstNum;
            min = secondNum;
        }
        else {
            max = secondNum;
            min = firstNum;
        }

        for(int i=2; i<=max; i++){
            if((firstNum % i == 0) && (secondNum % i == 0)){
                GCD = i ;
                break;
            }
            else{
                GCD = 1;
            }
        }
        System.out.printf("G.C.D of %d and %d = %d",firstNum,secondNum,GCD);

    }
}
