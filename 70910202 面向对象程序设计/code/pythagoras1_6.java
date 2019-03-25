package homework;

import java.util.Scanner;

public class pythagoras1_6 {
    public static void main(String[] args) {
        int no_1,no_2;
        int temp_1,temp_2;
        Scanner sc = new Scanner(System.in);
        no_1 = sc.nextInt();
        no_2 = sc.nextInt();
        sc.close();
        temp_1 = func(no_1);
        temp_2 = func(no_2);
        if ((temp_1 == no_2) && (temp_2 == no_1))
            System.out.print(1);
        else
            System.out.print(0);
    }
    private static int func(int number) {
        int temp=0;
        System.out.print(number+",");
        for (int i=number/2;i>1;i--) {
            if (number%i==0) {
                System.out.print(i + "+");
                temp += i;
            }
        }
        System.out.println(1+"="+(temp+1));
        return temp+1;
    }
}
