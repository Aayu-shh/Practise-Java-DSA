package Pattern;

public class HollowRectangle {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (j == 1 || j == m || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
