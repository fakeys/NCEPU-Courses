package homework;

import java.util.Scanner;

public class gcd1_2 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc =new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        int i = a<b ? a : b;
        while ((a%i!=0) || (b%i!=0))
            i--;
        System.out.println(i+" "+a*b/i);
    }

}
