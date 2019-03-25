package homework;

import java.util.Scanner;

public class grade3_10 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        String[] name = new String[num];
        int[] grade = new int[num];
        for (int i = 0; i < num; i++) {
            name[i] = sc.next();
            grade[i] = sc.nextInt();
        }
        sc.close();
        for (int k = 0; k < num;)
            for (int i = 0; i < num; i++) {
                int j;
                for (j = i + 1; j < num; j++)
                    if (grade[i] < grade[j])
                        break;
                if ((j == num)&&(grade[i]!=0)) {
                    System.out.println("            " + name[i] + "   " + grade[i]);
                    k++;
                    grade[i] = 0;
                    break;
                }
            }
    }
}
