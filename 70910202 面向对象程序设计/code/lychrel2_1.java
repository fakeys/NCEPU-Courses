package homework;

import java.util.Scanner;

public class lychrel2_1 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();
        if (number==reverse(number))
            System.out.println(number);
        else {
            for (int i=1;number!=reverse(number);i++) {
                int renumber = reverse(number);
                System.out.println(i+":"+number+"+"+renumber+"="+(number+renumber));
                number += renumber;
            }
            System.out.println(number);
        }
    }
    private static int reverse(int number) {
        String line = Integer.toString(number);
        int len = line.length();
        char[] nums = new char[len];
        for (int i = 0; i < len; i++)
            nums[len - 1 - i] = line.charAt(i);
        int renums = Integer.valueOf(String.valueOf(nums));
        return renums;
    }
}

