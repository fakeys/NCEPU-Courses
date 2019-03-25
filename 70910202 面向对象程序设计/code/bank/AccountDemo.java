import java.util.Scanner;

public class AccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FixedDepositAccount ezio = new FixedDepositAccount();
        System.out.print("ID:");
        String ezioId = sc.next();
        System.out.print("Balance:");
        double ezioBa = sc.nextDouble();
        System.out.print("Months:");
        int ezioMon = sc.nextInt();
        System.out.print("Rate:");
        double ezioRa = sc.nextDouble();

        ezio.setBalance(ezioBa);
        ezio.setMonths(ezioMon);
        ezio.setRate(ezioRa);
	    ezio.setIdCard(ezioId);
        ezio.print();

        BackingAccount lily = new BackingAccount();
        System.out.print("ID:");
        String lilyId = sc.next();
        System.out.print("Balance:");
        double lilyBa = sc.nextDouble();
        System.out.print("Days:");
        int lilyDay = sc.nextInt();
        System.out.print("Rate:");
        double lilyRa = sc.nextDouble();
        sc.close();

        lily.setBalance(lilyBa);
        lily.setDays(lilyDay);
        lily.setRate(lilyRa);
	    lily.setIdCard(lilyId);
	    lily.print();
    }
}
