package AdvancePatterns;

public class PallindromicNumericPyramids {
    public static void main(String args[]){
       int n =5;
       for(int i = 1; i<=n;i++){
           for(int j = 1; j<=(n-i);j++){
               //Spaces
               System.out.print(" ");
           }
           for(int j=i;j>=1;j--){
               //Numbers in Reverse
               System.out.print(j);
           }
           for(int j=2;j<=i;j++){
               //Numbers in Forward
               System.out.print(j);
           }
           System.out.println();
       }
    }
}

//    1
//   212
//  32123
// 4321234
//543212345