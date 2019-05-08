/*Write a program to set up an array of places, Loop round and remove the vowels. Display the new
words in console
Input:
India
United States
Germany
Egypt
czechoslovakia*/

package com.stackroute.PE3;

import java.util.Scanner;

public class VowelExemption {


    private static String[] string;

    public static void main(String args[]){
        
        VowelExemption.vowelRemoveCheck();
    }

    private static void vowelRemoveCheck() {

        String str1, str2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String : ");
        str1 = scan.nextLine();
        str2 = str1.replaceAll("[aeiou]", "");
        // adding AEIOU to capture Vowels in uppercase.
        System.out.println("All Vowels Removed Successfully");

        System.out.println(str2);
    }

}

