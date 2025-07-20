package Array;

import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        //2D Arrays = Matrix
        // space rows X columns X 4 bytes (for integer 2D array)
//        createUserMatrix();
        search();
    }

    static void createUserMatrix() {
        int[][] matrix = createMatrix();
        //Printing the recieved array
        printMatrix(matrix);

    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void search() {
        int[][] matrix = createMatrix();
        printMatrix(matrix);
        System.out.print("Enter Number to search: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //searching "n" in the Matrix
        boolean success=false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == n) {
                    System.out.println("Given Number found at index -> (" + i + "," + j + ")");
                    success = true;
                    break;
                }
            }

            if(success)
                break;
        }
        if(!success){
            System.out.println("Number not found    ");
        }
    }

    /*
         Creates a 2-D array based on user input
    */
    private static int[][] createMatrix() {
        System.out.println("Enter Rows,Columns, and rows x columns number of elements in corresponding lines");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix1 = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        return matrix1;
    }
}
