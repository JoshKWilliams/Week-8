

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private boolean hasOverdraft;

    public BankAccount (String accountNumber, String accountHolder, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.hasOverdraft = hasOverdraft;
    }

    public BankAccount (String accountNumber, String accountHolder, double balance, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }

    public String getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder () {
        return accountHolder;
    }

    public void setAccountHolder (String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public boolean hasOverdraft () {
        return hasOverdraft;
    }

    public void setHasOverdraft (boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public void deposit (double amount) {
        this.balance += amount;
    }

    public void withdraw (double amount) {
        this.balance -= amount;
    }

    public void addInterest (int interestRate) {
        this.balance += this.balance * (interestRate / 100.0);
    }

    @Override
    public String toString () {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                ", hasOverdraft=" + hasOverdraft +
                '}';
    }


    public static void main (String[] args) {

    BankAccount bankAcc = new BankAccount("6982534" , "Josh Williams" , 0.00 , true);
    System.out.println("Creating account...");
    System.out.println(bankAcc.toString());


    bankAcc.deposit(1500.00);
    System.out.println("Depositing £1500.00");
    System.out.println(bankAcc.getBalance());
    System.out.println(bankAcc.toString());

    bankAcc.withdraw(250.00);
    System.out.println("Withdrawing £250.00");
    System.out.println("Balance is now " + bankAcc.getBalance());
    System.out.println(bankAcc.toString());

    bankAcc.addInterest(10);
    System.out.println("Adding interest...");
    System.out.println("Balance is now " + bankAcc.getBalance());
    System.out.println(bankAcc.toString());




    }

}
