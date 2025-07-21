package Recursion;

class Recursion1 {
    public static void main(String[] args) {
        int n =5;
        printNum(n);
        System.out.println(printFactorial(n));
        int a=0,b=1;
        //Prints first 'n' fibonacci numbers
        printFibonacci(a,b,n);

        //Sum of first "n" natural Nums
        System.out.println("Sum of first "+n+" natural numbers: "+sumOfN(n));

        //String in Reverse
        printStringInReverse("aayush","aayush".length()-1);
    }

    private static void printStringInReverse(String str, int index) {
        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index--));
        printStringInReverse(str,index);
    }

    private static int sumOfN(int n) {
    if(n==1){
        return 1;
    }
    return n+sumOfN(n-1);
    }

    private static void printFibonacci(int a, int b, int n) {
    if(n==0){
        System.out.println();
        return;
    }
        System.out.print(a+" ");
        printFibonacci(b,a+b,n-1);
    }

    private static int printFactorial(int n) {
    if(n<1){
        return 1;
    } else if (n==1) {
        System.out.print(1+" = ");
        return n * printFactorial(n - 1);
    }
    else {
        System.out.print(n + " * ");
        return n * printFactorial(n - 1);
    }
    }

    private static void printNum(int n){
        if(n==0){
            System.out.println();
            return ;
        }
        System.out.print(n--+" ");
        printNum(n);
    }
}
