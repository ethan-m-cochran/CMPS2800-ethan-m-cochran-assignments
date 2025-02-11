package src;
//homework:
//provide appropriate get and set methods
//modify printAccount as appropriate
public class Account {
    private String customer = "ethan";
    private double balance = 1.00;

    public Account() {}

    public void printAccount() {
        System.out.println("Account Info");
    }
    public Account(String name, double balance) {
        this.customer = name;
        this.balance = balance;
    }

    public static void main(String[] args) {
        Account Account = new Account();
        Account.printAccount();
        Account account1 = new Account("John Doe", 500);
        account1.printAccount();
    }
}
