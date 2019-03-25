package homework;

import java.util.Scanner;

public class composite2_2 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();
        for (int i=2;i<=number;i++) {
            if ((isprime(i)) && (number%i==0)) {
                System.out.print(i+" ");
                while (number%i==0)
                    number/=i;
            }
        }
    }

    public static boolean isprime(int number) {
        int i;
        if (number == 1 || number == 0)
            return false;
        else {
            for (i = 2; i < number/2; i++)
                if (number % i == 0)
                    return false;
            return true;
        }
    }
}
