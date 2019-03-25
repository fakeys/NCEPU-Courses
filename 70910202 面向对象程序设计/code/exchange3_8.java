package homework;

import java.util.Scanner;

public class exchange3_8 {
    public static void main(String[] args) {
        int row1,col1,row2,col2,aimx,aimy;
        Scanner sc = new Scanner(System.in);
        row1 = sc.nextInt();
        col1 = sc.nextInt();
        int[][] arr1 = new int[row1][col1];
        for (int i=0;i<row1;i++)
            for (int j=0;j<col1;j++)
                arr1[i][j] = sc.nextInt();
        row2 = sc.nextInt();
        col2 = sc.nextInt();
        int[][] arr2 = new int[row2][col2];
        for (int i=0;i<row2;i++)
            for (int j=0;j<col2;j++)
            arr2[i][j] = sc.nextInt();
        aimx = sc.nextInt();
        aimy = sc.nextInt();
        sc.close();
        aimx = aimx - row2;
        aimy = aimy - col2;
        int m = Math.min(row1,aimx+row2);
        int n = Math.min(col1,aimy+col2);
        for (int i=aimx;i<m;i++)
            for (int j=aimy;j<n;j++)
                arr1[i][j] = arr2[i-aimx][j-aimy];
        for (int i=0;i<row1;i++) {
            for (int j = 0; j < col1; j++)
                System.out.print(arr1[i][j]+" ");
            System.out.println();
        }
    }
}
