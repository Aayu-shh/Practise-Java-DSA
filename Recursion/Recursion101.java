package Recursion;

public class Recursion101 {
    public static void main(String[] args) {
         printNum(5);
        printNum2(1);
    }

//    Descending
    static void printNum(int n) {
        if (n == 0)
            return;
        System.out.print(n-- + " ");
        printNum(n);

    }
// Ascending
    static void printNum2(int n) {
        if (n == 6)
            return;

        System.out.print(n++ + " ");
        printNum2(n);
    }
}
