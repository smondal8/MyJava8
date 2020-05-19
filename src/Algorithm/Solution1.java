package Algorithm;
import java.io.*;
import java.util.*;


public class Solution1 {


    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int n = 0; n < testCases; n++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String data = sc.next();
            printRohmbus(a,b,data);
        }

    }

    private static void printRohmbus(int a, int b, String data) {
        char[][] matrix = new char[a*2-1][a*2-1];
        for(int j=0;j<matrix.length;j++){
            for(int k=0;k<matrix[0].length;k++){
                matrix[j][k] = ' '; // & not needed
            }
        }
        int pointerToString = 0;
        //point 1
        int leftRow = matrix.length/2;
        int leftCol = 0;
        //point 2
        int topRow = 0;
        int topCol = matrix.length/2;
        //point 3
        int rightRow = matrix.length/2;
        int rightCol = matrix.length-1;
        //point 4
        int bottomRow = matrix.length-1;
        int bottomCol = matrix.length/2;
        int row = 0;
        int col = 0;
        int d = 0;
        while(a>d){
            //W to N
            row = leftRow;
            col = leftCol + d;
            while(row != topRow + d && col != topCol){
                if(matrix[row][col] == ' '){
                    matrix[row][col] = data.charAt(pointerToString);
                    pointerToString++;
                    if(pointerToString > data.length()-1)
                    {
                        pointerToString = 0;
                    }
                    row--;
                    col++;
                }
            }
            //N to E
            row = topRow + d;
            col = topCol;
            while(row != rightRow && col != rightCol-d){
                if(matrix[row][col] == ' '){
                    matrix[row][col] = data.charAt(pointerToString);
                    pointerToString++;
                    if(pointerToString > data.length()-1)
                    {
                        pointerToString = 0;
                    }
                    row++;
                    col++;
                }
            }
            //E to W
            row = rightRow;
            col = rightCol-d;
            while(row != bottomRow - d  && col != bottomCol){
                if(matrix[row][col] == ' '){
                    matrix[row][col] = data.charAt(pointerToString);
                    pointerToString++;
                    if(pointerToString > data.length()-1)
                    {
                        pointerToString = 0;
                    }
                    row++;
                    col--;
                }
            }
            //S to W
            row = bottomRow - d;
            col = bottomCol;
            while(row != leftRow  && col != leftCol + d){
                if(matrix[row][col] == ' '){
                    matrix[row][col] = data.charAt(pointerToString);
                    pointerToString++;
                    if(pointerToString > data.length()-1)
                    {
                        pointerToString = 0;
                    }
                    row--;
                    col--;
                }
            }

            d++;
        }
        matrix[matrix.length/2][matrix.length/2] = data.charAt(pointerToString);
        print2D(matrix);
    }
    public static void print2D(char mat[][])
    {
        // Loop through all rows
        for (int i = 0; i < mat.length; i++) {

            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "");
            }
            System.out.println();
        }

    }
}







