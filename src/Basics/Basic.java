package Basics;

import java.io.*;
import java.util.*;

public class Basic {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean result = checkPalindrom(A);
        if(result){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
    static boolean checkPalindrom(String input){
        String reversed="";
        for(int i = input.length()-1;i>=0;i--){
            reversed = reversed.concat(String.valueOf(input.charAt(i)));
        }
        return (reversed.equals(input))?true:false;
    }
}



