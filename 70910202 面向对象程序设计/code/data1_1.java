package homework;

import java.util.Scanner;

public class data1_1 {
    public static void main(String[] args) {
        int year,month,days,day=0,d=0;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        month = sc.nextInt();
        days = sc.nextInt();
        sc.close();
        for (int i=1;i<month;i++){
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: {
                    day = 31;
                    break;
                }
                case 4:
                case 6:
                case 9:
                case 11: {
                    day = 30;
                    break;
                }
                case 2: {
                    if ((year%100!=0 && year%4==0)||(year%400==0))
                        day = 29;
                    else
                        day = 28;
                }
                default:
                    break;
            }
            d += day;
        }
        System.out.println(d+days);
    }
}
