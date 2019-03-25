package homework;

import java.util.Scanner;

public class subway1_7 {
    public static void main(String[] args) {
        int distance;
        Scanner sc = new Scanner(System.in);
        distance = sc.nextInt();
        sc.close();
        System.out.print("price=");
        if (distance<=6)
            System.out.print(3);
        else if (distance<=12)
            System.out.print(4);
        else if (distance<=22)
            System.out.print(5);
        else if (distance<=32)
            System.out.print(6);
        else
            System.out.print(7+(distance-33)/20);
    }
}
