package homework;

import java.util.Scanner;

public class page1_9 {
    public static void main(String[] args){
        int rows,pageSize;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        pageSize = sc.nextInt();
        sc.close();
        if (rows%pageSize!=0)
            System.out.println(rows / pageSize + 1);
        else
            System.out.println(rows/pageSize);
    }
}
