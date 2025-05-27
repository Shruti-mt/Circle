package Bank;

public class Bank_Customer {
    private String custName;
    private String customerId;
    private String customerAddress;

    public Bank_Customer(String custName, String customerId, String customerAddress) {
        this.custName = custName;
        this.customerId = customerId;
        this.customerAddress = customerAddress;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Address: " + customerAddress);
    }
}
