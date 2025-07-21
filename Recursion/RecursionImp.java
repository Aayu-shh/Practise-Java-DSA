package Recursion;

import java.util.HashSet;

public class RecursionImp {
    static int first = -1;
    static int last = -1;
    static boolean[] charMapArr = new boolean[26];
    static HashSet<String> uniqueSubseqSet = new HashSet<>();
    static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx"};
    public static void main(String[] args) {
         int n = 3;
         towerOfHanoi(n, "Source", "Helper", "Destination");

        // String s = "Ashu";
        // printStringReverse(s, s.length() - 1); // O(n) ~ n=> length of String4

        // String s1 = "abcdefgabcda";
        // printOccurances(s1, 0, 'a');

        // int arr[] = { 1, 2, 2 };
        // System.out.println(checkStrictlyIncreasing(arr, 0));

        // String str = "abxxpxcvx=-x";
        // moveAllxToEnd(str, new String(), 0, 0);

        /*
         * curr char - char a = INDEX of char in arrayMap ->
         * [countA,countB,countC,....,countD]
         */
        // String str = "abcdaabeffghadeig";
        // removeDuplicatesFromString(str, new String(), 0);

        String str = "aaa";
        printSubsequences(str, 0, "", uniqueSubseqSet);
        System.out.println('a'-'0');
    }

    /**
     * Solves the Tower of Hanoi problem for `n` disks.
     * <p>
     * The Tower of Hanoi is a classic problem in which you have three towers
     * (source, helper, and destination)
     * and `n` disks of different sizes. The goal is to move all the disks from the
     * source tower to the destination
     * tower following these rules:
     * 1. Only one disk can be moved at a time.
     * 2. A disk can only be placed on top of a larger disk or on an empty tower.
     * <p>
     * This method uses recursion to solve the problem by breaking it down into
     * smaller subproblems.
     *
     * @param n      The number of disks to move.
     * @param src    The name of the source tower.
     * @param helper The name of the helper tower.
     * @param dest   The name of the destination tower.
     */
    static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) { // base case
            System.out.println("Transferring disk: " + n + " " + src + " => " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transferring disk: " + n + " " + src + " => " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }

    static void printStringReverse(String s, int index) {
        if (index == 0) {
            System.out.println(s.charAt(index));
            return;
        }
        System.out.print(s.charAt(index));
        printStringReverse(s, index - 1);
    }

    static void printOccurances(String s, int index, char element) {
        if (index == s.length()) {
            System.out.println("First Occurance at Index: " + first);
            // in case first == last
            last = last == -1 ? first : last;
            System.out.println("Last Occurance at Index: " + last);
            return;
        }

        if (s.charAt(index) == element) {
            if (first == -1)
                first = index;
            else
                last = index;
        }
        printOccurances(s, index + 1, element);
    }

    private static boolean checkStrictlyIncreasing(int[] arr, int index) {
        if (index == arr.length - 1)
            return true;
        else if (arr[index] >= arr[index + 1]) {
            // array is unsorted
            return false;
        }
        return checkStrictlyIncreasing(arr, index + 1);

    }

    /**
     * This method moves all occurrences of the character 'x' in the given string to
     * the end of the string.
     * It uses recursion to traverse the string and build a new string with 'x'
     * characters moved to the end.
     * <p>
     * Time Complexity: O(n)
     * Space Complexity: O(n) - due to the recursion stack and the new string
     * being
     * built.
     *
     * @param str    The original string in which 'x' characters need to be moved to
     *               the end.
     * @param newStr The new string being built with 'x' characters moved to the
     *               end.
     * @param index  The current index being processed in the original string.
     * @param count  The count of 'x' characters encountered so far.
     */
    private static void moveAllxToEnd(String str, String newStr, int index, int count) {
        if (index == str.length() - 1) {
            // base case
            while (count >= 0) {
                newStr += "x";
                count--;
            }
            System.out.println(newStr);
            return;
        } else if (str.charAt(index) == 'x') {
            count++;
            moveAllxToEnd(str, newStr, ++index, count);
        } else {
            newStr += str.charAt(index);
            moveAllxToEnd(str, newStr, ++index, count);
        }
    }

    private static void removeDuplicatesFromString(String str, String newStr, int index) {

        if (index == str.length() - 1) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        int currCharIndex = currChar - 'a';
        if (charMapArr[currCharIndex]) {
            removeDuplicatesFromString(str, newStr, ++index);
        } else {
            newStr += currChar;
            charMapArr[currCharIndex] = true;
            removeDuplicatesFromString(str, newStr, ++index);
        }
    }

    private static void printSubsequences(String str, int index, String newStr, HashSet<String> set) {
        if (index == str.length()) {
            if (set.contains(newStr))
                return;
            else {
                set.add(newStr);
                System.out.println(newStr);
                return;
            }
        }

        char currChar = str.charAt(index);
        // Choice 1 to be
        printSubsequences(str, index + 1, newStr + currChar, set);
        // Choice 2 Not to be
        printSubsequences(str, index + 1, newStr, set);
    }

    private static void printKeypadCombinations(String str, int idx, String combination){
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];
    }
}
