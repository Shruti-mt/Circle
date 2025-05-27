package Bank;

public class Bank_Transaction {
    private String accountName; // SBI, Canara, etc.
    private String accountHolderName;
    private String accountType; // Saving or Business
    private String accountNumber;
    private double balance;

    public Bank_Transaction(String accountName, String accountHolderName, String accountType, String accountNumber,
            double balance) {
        this.accountName = accountName;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayTransactionDetails() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Bank_Customer customer = new Bank_Customer("Ravi Kumar", "C12345", "123 MG Road, Bangalore");
        customer.displayCustomerDetails();

        Bank_Transaction transaction = new Bank_Transaction("SBI", "Ravi Kumar", "Saving", "SBIN0001234", 50000.00);
        transaction.displayTransactionDetails();
    }
}