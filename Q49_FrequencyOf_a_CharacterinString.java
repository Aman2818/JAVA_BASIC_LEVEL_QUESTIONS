package com.aman;

import java.util.Scanner;

public class Q49_FrequencyOf_a_CharacterinString {

    //this converts string to array of characters
    static char[] stringToCharArray(String s){
        char[] charArray = new char[s.length()];
        for(int i=0; i<charArray.length; i++){
            charArray[i] = s.charAt(i);
        }
        return charArray;
    }


    static int frequencyOfaParticularCharinString(String s , char c){
//        char[] arrayOfCharIn_s = s.toCharArray(); // this can also be used here it is a builtin method in string
        char[] arrayOfCharIn_s = stringToCharArray(s);

        int countOf_c =0;
        for(int i=0; i<arrayOfCharIn_s.length ; i++){
            if(c == arrayOfCharIn_s[i]){
                countOf_c++;
            }
        }
        return countOf_c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = scan.nextLine();
        System.out.println("Enter the character whose freq you want to know in String s: ");
        char c = scan.next().charAt(0);

        System.out.println(frequencyOfaParticularCharinString(s,c));
    }
}
