package com.aman;

import java.util.Scanner;

public class Q40_ReverseStringUsingRecurssion {
    static String reverse(String str){
        String reversed_str ;

        if(str.length() <= 1 || str == null) {
            reversed_str = str;
        }
        else{
            reversed_str = reverse(str.substring(1)) + str.charAt(0);//From here the str.substring = man  so now this is passed to upper me reversed_str method ke pass so ab str value changed to man
//          // similary in the next steps the Str.substring will be (an) so this valur again passed to reversed_str again the str becomes (an)
        }
        return reversed_str;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(reverse(str));

    }
}
