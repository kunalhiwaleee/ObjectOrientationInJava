public class BankAccount {
    
    private String accountNumber;
    private float balance;

    public BankAccount(String accountNumber, float balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter Method to access balance
    public void getBalance() {
        System.out.println("Current Account Balance is " + this.balance);
    }

    // Setter Method to handle balance
    public void depoist(float ammount) {
        if(ammount < 0) {
            System.out.println("Invalid Ammount. Ammount must be greater than 0");
        }
        else {
            this.balance += ammount;
            System.out.println("Amount Credited Successfully");
            this.getBalance();
        }
    }

    public void withdrawal(int ammount) {
        if(this.balance >= ammount && this.balance != 0) {
            this.balance-= ammount;
            System.out.println("Ammount Withdrawn Successfully");
            this.getBalance();
        }
        else {
            System.out.println("Invalid or insufficient funds");
        }
    }


}
