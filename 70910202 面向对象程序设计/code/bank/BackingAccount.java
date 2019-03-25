public class BackingAccount extends Account {
    private int days;
    private double rate;

    public BackingAccount() {}
    public BackingAccount(String idCard, double balance) {
        super(idCard, balance);
    }
    public BackingAccount(int days, double rate) {
        this.days = days;
        this.rate = rate;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public int getDays() {
        return days;
    }

    @Override
    public double getInterest() {
        return getBalance()*rate*days/365;
    }

    @Override
    public void print() {
        System.out.println("account:" + getIdCard() + " balance:"
                + String.format("%.2f",getBalance()) + " days:" +
                getDays() + " interest:" +
                String.format("%.2f",getInterest()) + " (rate:" +
                String.format("%.2f",getRate()*100) + "%)");
    }

}
