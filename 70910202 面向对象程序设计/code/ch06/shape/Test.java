import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        System.out.print("the Circle area is:");
        System.out.printf("%.2f", Math.PI * c *c);
        System.out.println();
        System.out.print("the Rectangle area is:");
        System.out.printf("%.2f", (double)f * g);
        System.out.println();
    }
}
