package project;

import java.util.*;

public class BankManager {
    private Map<Customer, Set<BankAccount>> customerAccounts = new HashMap<>();

    public void addCustomer(Customer customer) {
        customerAccounts.putIfAbsent(customer, new HashSet<>());
    }

    public void addBankAccount(Customer customer, BankAccount account) {
        Set<BankAccount> accounts = customerAccounts.get(customer);
        if (accounts != null) {
            accounts.add(account);
        }
    }

    public Set<BankAccount> getCustomerAccounts(Customer customer) {
        return customerAccounts.getOrDefault(customer, Collections.emptySet());
    }

    public boolean deposit(Customer customer, String accountNumber, double amount) {
        Set<BankAccount> accounts = customerAccounts.get(customer);
        if (accounts != null) {
            for (BankAccount account : accounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    account.deposit(amount);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean withdraw(Customer customer, String accountNumber, double amount) {
        Set<BankAccount> accounts = customerAccounts.get(customer);
        if (accounts != null) {
            for (BankAccount account : accounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    return account.withdraw(amount);
                }
            }
        }
        return false;
    }

    public void displayCustomerAccounts(Customer customer) {
        Set<BankAccount> accounts = customerAccounts.get(customer);
        if (accounts != null && !accounts.isEmpty()) {
            System.out.println("Accounts for customer: " + customer.getName());
            for (BankAccount account : accounts) {
                System.out.println(account);
            }
        } else {
            System.out.println("No accounts found for customer: " + customer.getName());
        }
    }
}
