package homework;

import java.util.Scanner;

public class narcissistic1_10 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();
        for (int i=100;i<=number;i++)
            if (isnarcissistic(i))
                System.out.println(i);
    }
    private static boolean isnarcissistic(int number) {
        int unit = number%10;
        int ten = number/10%10;
        int hundred = number/100;
        if (((unit*unit*unit)+(ten*ten*ten)+(hundred*hundred*hundred)) == number)
            return true;
        else
            return false;
    }
}
