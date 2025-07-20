package Array;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        arrays0();
        searchArray();
    }

    private static void arrays1() {
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 95;
        marks[2] = 92;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        System.out.println("From Loop:");
        for (int x : marks) {
            System.out.println(x);
        }
    }

    private static void arrays0() {
        int[] myArray = getArray();

        System.out.println("Array received is");
        for (int x : myArray)
            System.out.print(x + ",");
    }

    //Linear Search Algorithm
    private static void searchArray() {
        int[] myArray = getArray();
        System.out.print("Enter Number to search: ");
        int n = new Scanner(System.in).nextInt();
        boolean success = false;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == n)
            {
                success=true;
                System.out.println("Number found at: " + i);
                break;
            }
        }
        if(!success) System.out.println("Number Not found");
    }

    //Method to get Array from user
    private static int[] getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Element at index " + i + " : ");
            myArray[i] = sc.nextInt();
        }
        return myArray;
    }
}
