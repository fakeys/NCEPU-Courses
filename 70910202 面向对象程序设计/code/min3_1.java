package homework;

import java.util.Scanner;

public class min3_1 {
    public static void main(String[] args) {
        int rows,cols;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        for (int i=0;i<rows;i++)
            for (int j=0;j<cols;j++)
                arr[i][j] = sc.nextInt();
        sc.close();
        for (int i=0;i<rows;i++) {
            int minx=i,miny=0;
            for (int j=0;j<cols;j++)
                if (arr[minx][miny] > arr[i][j])
                    miny = j;
            int k;
            for (k=0;k<rows;k++)
                if (arr[minx][miny] > arr[k][miny])
                    break;
            if (k==rows)
                System.out.println(arr[minx][miny]+" "+(minx+1)+" "+(miny+1));
            for (int j=miny+1;j<cols;j++) {
                if (arr[minx][miny] == arr[i][j]) {
                    miny = j;
                    int m;
                    for (m = 0; m < rows; m++)
                        if (arr[minx][miny] > arr[m][miny])
                            break;
                    if (m == rows)
                        System.out.println(arr[minx][miny] + " " + (minx + 1) + " " + (miny + 1));
                }
            }
        }
    }
}
