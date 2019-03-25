package homework;

import java.util.Scanner;
import java.util.Arrays;

public class search2_4 {
    public static void main(String[] args) {
        int len;
        Scanner sc = new Scanner(System.in);
        len = sc.nextInt();
        int[] arr = new int[len];
        for (int i=0;i<len;i++)
            arr[i] = sc.nextInt();
        sc.close();
        Arrays.sort(arr);
        System.out.println(arr[len-1]+" "+arr[0]);
    }
}
