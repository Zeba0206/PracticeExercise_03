 /*1.Create a class called StudentMarks, which prompts user for the number of students, reads it
        from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
        grades of each of the students and saves them in an int array called stuGrades. Your program shall
        check that the grade is between 0 and 100 else has to trow an error message. */


package com.stackroute.PE3;

import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class StudentMarks {


    public static void main(String args[]){
        try {
            StudentMarks.checkGrades();
        }catch (Exception e){
            System.out.println("Error");
        }
    }



    public static void checkGrades() throws Exception {

        int numOfStudents;



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of Students : ");
        numOfStudents= scan.nextInt();
        int stuGrades[]=new int[numOfStudents];

        for(int i=0; i<=numOfStudents;i++) {
            System.out.println("Enter grades for student " + (i + 1) + ": ");
            stuGrades[i] = scan.nextInt();


            if (stuGrades[i] > 0 && stuGrades[i] <= 100) {
                System.out.println("");
            } else {
                throw new Exception("Error");

            }
        }



    }
}

