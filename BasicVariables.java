public class BasicVariables {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        int[] retrn = swapWithoutVar(a,b);
        System.out.println("Original: "+a+" "+b);
        System.out.println("Swapped: "+retrn[0]+" "+retrn[1]);
    }

    private static int[] swapWithoutVar(int a,int b){
        a=a+b;
        b=a-b; //Swapped b -> a+b - b
        a=a-b; //Swapped a -> a+b -(a)
        return new int[]{a, b};
    }
}

