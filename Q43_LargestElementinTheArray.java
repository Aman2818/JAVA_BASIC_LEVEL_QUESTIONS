package com.aman;

public class Q43_LargestElementinTheArray {
    public static void main(String[] args) {
        int [] arr = {5,4,8,15,1};
        int max = arr[0];
        int indexOfMax = 0;
        for(int i=1; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                indexOfMax =i;
            }
        }
        System.out.println("Largest Element in the array: "+max);
        System.out.println("And it is at Index : "+indexOfMax);
    }
}
