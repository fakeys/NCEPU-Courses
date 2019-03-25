package homework;

import java.util.Arrays;
import java.util.Scanner;

public class singer3_6 {
    public static void main(String[] args) {
        int num,count1=1,count2=1;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int[] arr = new int[num];
        for (int i=0;i<num;i++)
            arr[i] = sc.nextInt();
        sc.close();
        Arrays.sort(arr);
        for (int i=1;i<num;i++)
            if (arr[0]==arr[i])
                count1++;
        for (int i=0;i<num-1;i++)
            if (arr[num-1]==arr[i])
                count2++;
        int sum = 0;
        count1 = Math.min(2,count1);
        count2 = Math.min(2,count2);
        for (int i=count1;i<num-count2;i++)
            sum += arr[i];
        double ave = sum*1.0/(num-count1-count2);
        if (count1 == num)
            System.out.printf("%.2f",(double)arr[0]);
        else
            System.out.printf("%.2f",ave);
    }
}
