package homework;

import java.util.Scanner;

public class sort3_7 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int[][] arr = new int[num][2];
        for (int i=0;i<num;i++)
            for (int j=0;j<2;j++)
                arr[i][j] = sc.nextInt();
        for (int i=0;i<num-1;i++) {
            int temp = arr[i][0];
            int tempy = arr[i][1];
            for (int j=num-1;j>i;j--)
                if (temp>arr[j][0]) {
                    arr[i][0] = arr[j][0];
                    arr[j][0] = temp;
                    temp = arr[i][0];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = tempy;
                    tempy = arr[i][1];
                }
        }
        int left=arr[0][0],right=arr[0][1];
        for (int i=1;i<num;i++) {
            if ((left<=arr[i][0])&&(right>=arr[i][0]))
                right = Math.max(arr[i][1],right);
            else {
                System.out.println(left+" "+right);
                left = arr[i][0];
                right = arr[i][1];
            }
        }
        System.out.println(left+" "+right);
    }
}
