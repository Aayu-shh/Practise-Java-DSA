public class Functions {
    public static void main(String[] args) {
        fibo(5);
//        System.out.println(greatestCommonDivisor(1064,540));
    }

    static void fibo(int n){
        int x=0;
        int y =1;
        System.out.print(x+" ");
        while(n>=0){
            int tmp =x+y;
            x=y;
            y=tmp;
            System.out.print(x+" ");
            n--;
        }
    }
    static int greatestCommonDivisor(int a, int b){
        int min = Math.min(a, b);
        int n =1;
        for(int i=1;i<=min;i++){
            if(a%i==0&b%i==0){
                n=i;
            }
        }
        return n;
    }
}


//5 - x 0 y 1 print 1
//4 - x 1 y 1 print 1
//3 - x 1 y 2 print 2
//2 - x 2 y 3 ptin 3
//1 - x 3 y 5 prnt 5
