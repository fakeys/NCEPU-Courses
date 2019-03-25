package homework;

import java.util.Scanner;

public class gcd2_7 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        System.out.print(gcd(a,b));
    }
    private static int gcd(int a,int b) {
        if (b == 0)
            return a;
        else
            return gcd(b,a%b);
    }
}
