import java.util.Scanner;

public class QuestionDemo {
    public static void main(String[] args) {
        MultiChoice test1 = new MultiChoice();
        String[] option1 = {"A.package","B.derive","C.polymorphism","D.Static"};
        char[] answer1 = {'A','B','C'};
        test1.setText("Characteristics of object-oriented program design is");
        test1.setOptions(option1);
        test1.setAnswer(answer1);

        SingleChoice test2 = new SingleChoice();
        String[] option2 = {"A.0","B.1","C.2","D.3"};
        test2.setText("Default value of int type is");
        test2.setOptions(option2);
        test2.setAnswer('A');

        Scanner sc = new Scanner(System.in);
        test1.print();
        String response1 = sc.nextLine();
        if (test1.check(response1))
            System.out.println("OK");
        else
            System.out.println("NO");

        test2.print();
        String response2 = sc.nextLine();
        if (test2.check(response2))
            System.out.println("OK");
        else
            System.out.println("NO");

        sc.close();
    }
}
