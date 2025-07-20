import java.util.Scanner;

public class Looping {
    public static void main(String args[]) {
        int a = 5;
        for (int i = 0; i < 5; i++) {
            System.out.println(a + i);
        }
        int arr[] = {1, 2, 3, 5, 6, 8, 9};
        int c = 0;
        for (int i : arr) {
            System.out.printf("Element %d is : %d\n", c, i);
            c++;
        }

        //iNFITE LOOP => for(int i=0; ;i++)

        while (c < 15) {
            System.out.println("from while:" + c);
            c++;
        }

        do {
            System.out.println("Hi Aayush");
            c++;
        } while (c < 17);

        //sum of n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
        sum = sum+i;
        }
        System.out.println("Sum: "+sum);
    }
}