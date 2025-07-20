package AdvancePatterns;

public class butterfly {
    public static void main(String[] args){
        int n = 4;
        //Upper Half
        for(int i = 1; i<=n;i++) {
            //*
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //*
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower half
        for(int i = n; i>=1;i--) {
            //*
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //*
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// i 1 to n
//
//*      *          i=1 SPACES=6 i=1        SPACES = 2x3 = 2x(4-1)
//**    **          i=2 SPACES=4 i=2        SPACES = 2x2 = 2x(4-2)
//***  ***          i=3 SPACES=2 i=3        SPACES = 2x1 = 2x(4-3)
//********          i=4 SPACES=0 i=4        SPACES = 0 = 2x(4-4)
//********          i=4 SPACES=0 i=4
//***  ***          i=3 SPACES=2 i=3
//**    **          i=2 SPACES=4 i=2
//*      *          i=1 SPACES=6 i=1