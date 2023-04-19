package com.aman;

import java.util.Scanner;

public class Q27_CheckArmstrongNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = scan.nextInt();
        int count_of_num=0;
        int rem;
        int armstrong_check = 0;
        int multiple;
        int container_num = num;

        while(num!=0){
            num=num/10;
            count_of_num++;
            }
        num=container_num;
        while(num!=0) {

            multiple=1;
            rem = num % 10;
            num = num / 10;

            for (int i = 0; i < count_of_num; i++) {
                multiple = multiple * rem;
            }
            armstrong_check = armstrong_check + multiple;
        }
        if(armstrong_check==container_num){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }

    }
}
