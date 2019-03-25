import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print(factorial(n));
    }
    private static BigInteger factorial(int n) {
        if (n==0)
            return BigInteger.valueOf(1);
        else
            return factorial(n-1).multiply(BigInteger.valueOf(n));
    }
}
