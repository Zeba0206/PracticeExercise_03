/*2. Write a program to compute the addition of two matrix, Read the number of rows and columns
as input, also the values of each matrix
Output:
Input number of rows of matrix: 3
Input number of columns of matrix: 2
Input elements of first matrix: 1 2 3 4 5 6
Input the elements of second matrix: 9 8 7 6 5 4
Sum of the matrices:-
10 10
10 10
10 10*/
package com.stackroute.PE3;

import java.util.Scanner;

public class AdditionOfMatrix {
    public static void main(String[] args) {
        AdditionOfMatrix.matrixOfAddition();

    }

    public static void matrixOfAddition() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows of matrix : ");
        int row = scan.nextInt();

        System.out.println("Enter number of columns of matrix : ");
        int column = scan.nextInt();

        int[][] firstmatrix = new int[row][column];
        int[][] secondmatrix = new int[row][column];
        int[][] addmatrix = new int[row][column];

        System.out.println("Input elements of first matrix : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                firstmatrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("Input elements of second matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                secondmatrix[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                addmatrix[i][j] = firstmatrix[i][j] + secondmatrix[i][j];
            }
        }


        System.out.println("Sum of the matrices:- ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(addmatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
