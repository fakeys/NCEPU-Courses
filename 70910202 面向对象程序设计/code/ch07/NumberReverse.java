import java.util.Scanner;

public class NumberReverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        sc.close();
        for(int i = min;i<=max;i++)
            if (i==reverse(i))
                System.out.println(i);
    }
    private static int reverse(int number) {
        String line = Integer.toString(number);
        int len = line.length();
        char[] nums = new char[len];
        for (int i = 0; i < len; i++)
            nums[len - 1 - i] = line.charAt(i);
        return Integer.valueOf(String.valueOf(nums));
    }
}
