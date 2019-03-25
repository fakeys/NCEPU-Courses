package homework;

import java.util.Scanner;

public class rmb2_8 {
    public static void main(String[] args) {
        int money,a,b,c,d;
        Scanner sc = new Scanner(System.in);
        money = sc.nextInt();
        sc.close();
        a = money/10;
        money %= 10;
        b = money/5;
        money %= 5;
        c = money/2;
        money %= 2;
        d = money;
        System.out.print(a+" "+b+" "+c+" "+d);
    }
}
