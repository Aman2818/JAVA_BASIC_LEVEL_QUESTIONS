package com.aman;

public class Q48_TransposeOfMatrix {
    static void transposeOfMatri(int[][] arr ,int row,int col){

        int[][] arr_transpose = new int[col][row];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr_transpose[j][i] = arr[i][j];
            }
        }
        for(int[] k : arr_transpose){
            for(int row_k : k){
                System.out.print(row_k+"   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int row=3 , col=3;
        transposeOfMatri(arr,row,col);

    }
}
