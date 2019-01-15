package Chapter8;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public void addCustomer(String name, double initialAmount) {
        customers.add(new Customer(name, initialAmount));
    }

    public void addTransaction(String customerName, double transactionAmount) {
        int index = customerIndex(customerName);
        if (index > -1) {
            customers.get(index).addTransaction(transactionAmount);
        } else {
            System.out.println("Invalid customer name");
        }
    }

    private int customerIndex(String name) {
        int index = -1;
        for (Customer c: customers) {
            if (c.getName().equals(name)) {
                index = customers.indexOf(c);
            }
        }
        return index;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }
}
