package Java8.Practise;

public class power {
    public static void main(String[] args) {
        System.out.println(calcPower(5,3));
    }
    public static int calcPower(int n,int power){
        if(power==0){
            return 1;
        } else if (power==1) {
            return n;
        }
        return n*calcPower(n,power-1);
    }
}
