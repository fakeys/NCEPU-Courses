package homework;

import java.util.Scanner;

public class perfect1_8 {
    public static void main(String[] args) {
        int low,high,flag=0;
        Scanner sc = new Scanner(System.in);
        low = sc.nextInt();
        high = sc.nextInt();
        sc.close();
        for (int i=low;i<=high;i++)
            if (isperfect(i)) {
                flag++;
                System.out.print(i + " ");
            }
        if (flag==0)
            System.out.println("No Answer");
    }
    private static boolean isperfect(int number) {
        int temp = 0;
        for (int i=number/2;i>0;i--)
            if (number%i==0)
                temp +=i;
        if (temp == number)
            return true;
        else
            return false;
    }
}
