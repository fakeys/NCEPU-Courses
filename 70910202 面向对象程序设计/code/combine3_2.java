package homework;

import java.util.Scanner;
import java.util.Arrays;

public class combine3_2 {
    public static void main(String[] args) {
        int len1,len2;
        Scanner sc = new Scanner(System.in);
        len1 = sc.nextInt();
        int[] arr1 = new int[len1];
        for (int i=0;i<len1;i++)
            arr1[i] = sc.nextInt();
        len2 = sc.nextInt();
        int[] arr2 = new int[len2];
        for (int i=0;i<len2;i++)
            arr2[i] = sc.nextInt();
        sc.close();
        int len = len1+len2;
        int[] arr = new int[len];
        for (int i=0;i<len1;i++)
            arr[i] = arr1[i];
        for (int i=len1;i<len;i++)
            arr[i] = arr2[i-len1];
        for (int i=0;i<len;i++)
            for (int j=len-1;j>i;j--) {
                if ((arr[i] == arr[j]) || (arr[i] % arr[j] == 0))
                    arr[i] = 0;
                else if (arr[j] % arr[i] == 0)
                    arr[j] = 0;
            }
        Arrays.sort(arr);
        for (int i=0;i<len;i++)
            if (arr[i]!=0)
                System.out.print(arr[i]+" ");
    }
}
