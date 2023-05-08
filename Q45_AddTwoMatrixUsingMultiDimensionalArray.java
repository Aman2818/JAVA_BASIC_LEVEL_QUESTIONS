package com.aman;

public class Q45_AddTwoMatrixUsingMultiDimensionalArray {
    static void addTwoMultiDimentionalArrays(int[][] arr1 ,int[][] arr2){

        int[][] result = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int i=0; i<result.length; i++){
            for(int j=0;j<result[i].length; j++){
                System.out.print(result[i][j]+"  ");
                if(j==2){
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        int [][] array1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array2 = {{1,2,3},{4,5,6},{7,8,9}};
        addTwoMultiDimentionalArrays(array1,array2);

    }
}
