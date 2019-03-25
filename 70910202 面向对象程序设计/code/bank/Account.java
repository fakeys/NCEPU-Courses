public class Account {
    private String idCard;
    private double balance;

    public Account() {}
    public Account(String idCard, double balance) {
        this.balance = balance;
        this.idCard = idCard;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public double getBalance() {
        return balance;
    }

    public String getIdCard() {
        return idCard;
    }

    public double getInterest() {
        return balance;
    }

    public void print() {
        System.out.print("fuck!");
    }
}
