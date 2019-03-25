package homework;

import java.util.Scanner;

public class encode1_5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        System.out.println(encode(number));
    }
    private static int encode(int number) {
        int thousand = number/1000;
        int hundred = number/100%10;
        int ten = number/10%10;
        int unit = number%10;

        thousand +=5;
        hundred +=5;
        ten +=5;
        unit +=5;

        thousand %=10;
        hundred %=10;
        ten %=10;
        unit %=10;

        thousand += unit;
        unit = thousand - unit;
        thousand = thousand -unit;
        hundred += ten;
        ten = hundred - ten;
        hundred = hundred - ten;

        return thousand*1000+hundred*100+ten*10+unit;
    }
}
