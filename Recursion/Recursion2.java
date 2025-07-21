package Recursion;

public class Recursion2 {
    public static void main(String[] args) {
        // sumOfNaturalNums(1, 5, 0);

        // -- Calculate Factorial
        // int fac = calcFactorial(0);
        // System.out.println("Factorial: " + fac);

        // --Fibonacci series till n nums
        // System.out.print(0 + " " + 1 + " ");
        // printFibo(0, 1, 5);

        // --Calculate power (stack height n)
        System.out.println(calcPower(2, 4));

        // --CalcPower Optimized to log2n
        System.out.println(calcPower2(2, 4));
    }

    private static int calcPower(int x, int n) {
        if (n == 1)
            return x;
        if (x == 0)
            return 0;
        return x * calcPower(x, n - 1);
        // x*cp(2,4) x*cp(2,3) x*cp(2,2) x*cp(2,1) x*x*x*x*x
    }

    private static int calcPower2(int x, int n) {
        if (n == 1)
            return x;
        if (x == 0)
            return 0;
        if (n % 2 == 0) {
            return calcPower2(x, n / 2) * calcPower2(x, n / 2);
        } else {
            return calcPower2(x, n / 2) * calcPower2(x, n / 2) * x;
        }
    }

    private static void printFibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printFibo(b, c, n - 1);
    }

    private static int calcFactorial(int n) {
        System.out.println(n);
        if (n == 1 || n == 0) {
            return 1;
        }
        System.out.print(n + "*");
        return n * calcFactorial(n - 1);
    }

    private static void sumOfNaturalNums(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sumOfNaturalNums(++i, n, sum);
        System.out.println(i);

    }
}
