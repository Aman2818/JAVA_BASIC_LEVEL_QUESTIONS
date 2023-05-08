package com.aman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	// write your code here
//        int[][] two_d_array = {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(two_d_array.length);



        // taking input from the user in two dimentional array
        int[][] two_d_array = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0; i<two_d_array.length; i++){
            for(int j=0; j<two_d_array[i].length;j++){
                two_d_array[i][j] = scan.nextInt();
            }
        }

        for(int i=0; i<two_d_array.length; i++){
            for(int j=0; j<two_d_array[i].length;j++){
                System.out.print(two_d_array[i][j]+" ");
                if(j==2){
                    System.out.println();
                }
            }
        }
    }
}
