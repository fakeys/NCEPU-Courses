package homework;

import java.util.Scanner;

public class sum2_5 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();
        System.out.print(sum(number));
    }
    private static int sum(int number) {
        int sum = 0;
        while (number!=0) {
            sum += number%10;
            number /= 10;
        }
        return sum;
    }
}
