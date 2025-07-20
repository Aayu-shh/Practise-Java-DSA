import java.util.*;
import java.util.Scanner;

public class input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);
        // Trying Lamda Functions
        String[] aStr = new String[name.length()];
        aStr = name.split("");
        Arrays.asList(aStr).forEach(c -> System.out.printf("%s,", c));
        sc.close();
    }
}
