public class Account {
    private String name ;
    private double balance ;

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0) {
            this.balance = balance;
        }

    }

    public void deposit (double depositA) {
        if (depositA > 0) {
            balance += depositA;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
