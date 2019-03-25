package homework;

import java.util.Scanner;

public class celsius2_9 {
    public static void main(String[] args) {
        int celsius;
        double fahrenheit;
        Scanner sc = new Scanner(System.in);
        celsius = sc.nextInt();
        sc.close();
        fahrenheit = celsius *9.0/5+32;
        System.out.printf("%.1f", fahrenheit);
    }
}
