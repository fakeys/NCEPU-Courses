public class FixedDepositAccount extends Account {
    private int months;
    private double rate;

    public FixedDepositAccount() {}
    public FixedDepositAccount(String idCard, double balance) {
        super(idCard,balance);
    }
    public FixedDepositAccount(String idCard, double balance,int months, double rate) {
        this.months = months;
        this.rate = rate;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getMonths() {
        return months;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public double getInterest() {
        return getBalance()*rate*months/12;
    }

    @Override
    public void print() {
        System.out.println("account:" + getIdCard() + " balance:"
        + String.format("%.2f",getBalance()) + " months:" +
        getMonths() + " interest:" +
        String.format("%.2f",getInterest()) + " (rate:" +
        String.format("%.2f",getRate()*100) + "%)");
    }
}
