package com.stackroute.PE3;

/*Write a program to create a com.stackroute.PE3.ChessBoard pattern with the help of multidimensional array, where
WW represents white color and BB represents Black color.*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ChessBoard {

       public static void main(String []args){
        ChessBoard.patternChessBoard();
    }

    private static void patternChessBoard() {

        String chess[][]=new String[8][4];
        for (int i = 0; i < 8; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                if(i%2==0) {
                    chess[i][j]="WW" + "|" + "BB" + "|";
                }
                else {
                    chess[i][j]="BB" + "|" + "WW" + "|";
                }
            }
        }

        for (int i=0;i<8;i++)
        {
            for(int j=0;j<4;j++) {

                System.out.print(chess[i][j]);
            }
            System.out.println();
        }
    }
}