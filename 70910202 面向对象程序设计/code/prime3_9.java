package homework;

import java.util.Arrays;
import java.util.Scanner;

public class prime3_9 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int[] arr = new int[num];
        int[] res = new int[100];
        for (int i = 0; i < num; i++)
            arr[i] = sc.nextInt();
        int k = 0;
        for (int j = 0; j < num; j++)
            for (int i = 2; i <= arr[j]; i++)
                if ((composite2_2.isprime(i)) && (arr[j] % i == 0)) {
                    res[k++] = i;
                    while (arr[j] % i == 0)
                        arr[j] /= i;
                }
        Arrays.sort(res, 0, k);
        for (int i = 0; i < k; i++)
            for (int j = k - 1; j > i; j--)
                if (res[i] == res[j])
                    res[j] = 0;
        for (int i = 0; i < k; i++)
            if (res[i] != 0)
                System.out.print(res[i] + " ");
    }
}