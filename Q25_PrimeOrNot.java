package com.aman;

import java.util.Scanner;

public class Q25_PrimeOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean prime = false;
        for(int i=2; i<num; i++){
            if(num%i==0){
                prime=false;
                break;
            }
            else{
                prime=true;
            }
        }
        if(prime==true){
            System.out.println(num+" is a Prime Number");
        }
        else{
            System.out.println(num+" is not a Prime Number");
        }
    }
}
