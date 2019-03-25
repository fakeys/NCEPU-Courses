package homework;

import java.util.Scanner;

public class salary2_3 {
    public static void main(String[] args) {
        double salary,rate;
        Scanner sc = new Scanner(System.in);
        salary = sc.nextDouble();
        sc.close();
        switch ((int)salary/1000) {
            case 0 : rate = 0;
                break;
            case 1 : rate = 0.1;
                break;
            case 2 : rate = 0.15;
                break;
            case 3 : rate = 0.2;
                break;
            default: rate = 0.25;
        }
        System.out.printf("%.2f", salary*(1-rate));
    }
}
