/*
Kevin Nguyen
Basic Java program to transpose a given matrix.

How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "javac *.java" to compile java files
	3.) type in "java JavaTM"
*/

//imports
import java.io.*;
import java.util.*;

//class
class JavaTM {
	//Global Declarations

	//main driver
	public static void main(String[] args) {
		//local Declarations
		System.out.println("HelloWorld");
	}

	//transpose will take a 2D array and output a transposed matrix
    public int[][] transpose(int[][] A) {
        //local declarations
        int i = 0, j = 0, colLen = A[0].length, rowLen = A.length;
        int[][] result = new int[colLen][rowLen]; //new matrix with sizes flipped for transposition
        
        //outer loop iterate by columns
        while(j < colLen) {
            //inner loop iterate by rows
            while(i < rowLen) {
                result[j][i] = A[i][j]; //fill resulting matrix
                i++;
            }
            j++; i=0;
        }
        
        return result;
    }	
}