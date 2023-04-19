package com.aman;

public class Q20_DisplayAlphabetsUsingLoop {
    public static void main(String[] args) {
        // ASCII value of a-z :-- 97-122
        // ASCII value of A-Z :-- 65-90

        for(int i=65;i<=90;i++){
            char char_form_of_int = (char) i;
            System.out.println(char_form_of_int);
        }

    }
}
