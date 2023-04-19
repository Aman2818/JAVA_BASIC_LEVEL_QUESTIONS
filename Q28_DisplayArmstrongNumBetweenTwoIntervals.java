package com.aman;

import java.util.Scanner;

public class Q28_DisplayArmstrongNumBetweenTwoIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st interval : ");
        int num1 = scan.nextInt();

        System.out.println("Enter the 2nd interval : ");
        int num2 = scan.nextInt();


        int count_of_num=0;
        int rem;
        int armstrong_check = 0;
        int multiple;

        for(int num=num1;num<=num2;num++) {
            int container_num=num;
            armstrong_check=0;
            while (num != 0) {
                num = num / 10;
                count_of_num++;
            }
            num = container_num;
            while (num != 0) {

                    multiple = 1;
                    rem = num % 10;
                    num = num / 10;

                    for (int i = 0; i < count_of_num; i++) {
                        multiple = multiple * rem;
                    }
                    armstrong_check = armstrong_check + multiple;
            }

                if (armstrong_check == container_num) {
                    System.out.println(container_num + " is Armstrong");
                }
                num=container_num;
                count_of_num=0;
            }
        }
    }

