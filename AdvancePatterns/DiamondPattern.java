package AdvancePatterns;
import java.time.*;

public class DiamondPattern {
    public static void main(String args[]) {
        int n =4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 *i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//                  i   j
//    *             1   1
//   ***            2   1 2 3
//  *****           3   1 2 3 4 5
// *******          4   1 2 3 4 5 6 7
//  *****           3   1 2 3 4 5
//   ***            2   1 2 3
//    *             1   1