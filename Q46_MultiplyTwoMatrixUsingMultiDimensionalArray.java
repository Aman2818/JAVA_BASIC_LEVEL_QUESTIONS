package com.aman;

public class Q46_MultiplyTwoMatrixUsingMultiDimensionalArray {
    static <i, j> void MultiplyTwoMultiDimensionalArray(int[][]arr1 , int[][] arr2){
        int[][] arr_result = new int[3][2];
        int sum=0 , i ,j;
        for(i=0; i<arr_result.length; i++){
            for(j=0; j<arr_result[i].length; j++){
                sum = sum + arr1[i][j] * arr2[j][i] ;
            }
            arr_result[i][j] = sum;
        }

        for(i=0; i<arr_result.length; i++){
            for(j=0; j<arr_result[i].length; j++){
                System.out.print(arr_result[i][j] +"  ");
                if(j==2){
                    System.out.println();
                }
            }

        }
    }

    public static void main(String[] args) {
        int[][] arr1 ={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{1,4},{2,5},{3,6}};
        MultiplyTwoMultiDimensionalArray(arr1,arr2);
    }
}
