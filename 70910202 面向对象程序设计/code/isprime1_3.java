package homework;

import java.util.Scanner;

public class isprime1_3 {
    public static void main(String[] args) {
        int number,i;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();
        if (number == 1 || number == 0)
            System.out.println(0);
        else {
            for (i=2;i<number;i++) {
                if (number%i==0) {
                    System.out.println(0);
                    break;
                }
            }
            if (i>=number)
                System.out.println(1);
        }
    }
}
