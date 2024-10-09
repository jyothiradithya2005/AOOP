package project;

public class Main {
    public static void main(String[] args) {
        BankManager manager = new BankManager();

        Customer customer1 = new Customer("C123", "John");
        BankAccount account1 = new BankAccount("A123", 1000.00, "Savings");
        BankAccount account2 = new BankAccount("A124", 5000.00, "Checking");

        manager.addCustomer(customer1);
        manager.addBankAccount(customer1, account1);
        manager.addBankAccount(customer1, account2);

        manager.displayCustomerAccounts(customer1);

        manager.deposit(customer1, "A123", 200.00);
        manager.withdraw(customer1, "A124", 500.00);

        manager.displayCustomerAccounts(customer1);
    }
}
