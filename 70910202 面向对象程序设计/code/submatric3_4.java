package homework;

import java.util.Scanner;

public class submatric3_4 {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        int[][] ma1 = new int[m][m];
        for (int i=0;i<m;i++)
            for (int j=0;j<m;j++)
                ma1[i][j] = sc.nextInt();
        n = sc.nextInt();
        int[][] ma2 = new int[n][n];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                ma2[i][j] = sc.nextInt();
        sc.close();
        int[][] res = new int[2][m];
        int flag,k = 0;
        res[0][0] = -1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++)
                if (ma1[i][j] == ma2[0][0]) {
                    res[0][k] = i;
                    res[1][k++] = j;
                }
        }
        for (int c=0;c<k;c++) {
            flag = 1;
            for (int i = res[0][c]; i < res[0][c] + n; i++)
                for (int j = res[1][c]; j < res[1][c] + n; j++)
                    if (ma1[i][j] != ma2[(i - res[0][c])][(j - res[1][c])])
                        flag = 0;
            if (flag == 0)
                res[0][c] = -1;
        }
        if (res[0][0] == -1)
            System.out.print(-1);
        else {
            int miny = 0;
            for (int c = 0; c < k; c++) {
                if (res[0][miny] > res[0][c])
                    miny = c;
                else if ((res[0][miny] == res[0][c])&&(res[1][miny] > res[1][c]))
                        miny = c;
            }
            System.out.println((res[0][miny] + 1) + "," + (res[1][miny] + 1));
        }
    }
}
