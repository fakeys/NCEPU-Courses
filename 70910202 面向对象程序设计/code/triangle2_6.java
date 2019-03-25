package homework;

import java.util.Scanner;

public class triangle2_6 {
    public static void main(String[] args) {
        double a,b,c,s,S;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        sc.close();
        s = (a+b+c)/2;
        S = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.3f",S);
    }
}
