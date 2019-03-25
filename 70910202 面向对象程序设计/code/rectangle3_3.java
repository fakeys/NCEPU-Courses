package homework;

import java.util.Scanner;

public class rectangle3_3 {
    public static void main(String[] args) {
        int n,sum;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sum = sc.nextInt();
        int[] arr1 = new int[sum];
        int[] arr2 = new int[sum];
        for (int i=0;i<sum;i++)
            arr1[i] = sc.nextInt();
        for (int i=0;i<sum;i++)
            arr2[i] = sc.nextInt();
        sc.close();
        int[][] rec1 = new int[n][n];
        int[][] rec2 = new int[n][n];
        evaluate(rec1,arr1);
        evaluate(rec2,arr2);
        int[][] rec3 = matrix(rec1,rec2);
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++)
                System.out.print(rec3[i][j] + " ");
            System.out.println();
        }
    }
    private static void evaluate(int[][] b,int[] arr) {
        int n = b[0].length;
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++) {
                if (i<=j)
                    b[i][j] =arr[i+j*(j+1)/2];
                else
                    b[i][j] =arr[j+i*(i+1)/2];
            }
    }
    private static int[][] matrix(int[][] a,int[][] b) {
        int n =a.length;
        int[][] c = new int[n][n];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                for (int k=0;k<n;k++)
                    c[i][j] += a[i][k] * b[k][j];
        return c;
    }
}
