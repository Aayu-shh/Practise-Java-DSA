package Pattern;

public class invertedHalfPyramid {
    public static void main(String [] args){
        int m = 5;
        for(int i=m;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
