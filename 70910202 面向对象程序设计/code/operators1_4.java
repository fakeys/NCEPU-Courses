package homework;

import java.util.Scanner;

public class operators1_4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String temp = sc.next();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        char op = temp.charAt(0);
        if (op == '+')
            System.out.println(a+"+"+b+"="+(a+b));
        else if (op == '-')
            System.out.println(a+"-"+b+"="+(a-b));
        else if (op == '*')
            System.out.println(a+"*"+b+"="+(a*b));
        else if (op == '/')
            System.out.println(a+"/"+b+"="+(a/b));
        else
            System.out.println("error");

    }
}
