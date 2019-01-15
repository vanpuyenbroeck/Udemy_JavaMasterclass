package Chapter8;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public void addBranch(String name) {
        if (branchIndex(name) == -1) {
            branches.add(new Branch(name));
        }
    }

    public void addCustomer(String branch, String customer, double initialTransaction) {
        int index = branchIndex(branch);
        if (index > -1) {
            branches.get(index).addCustomer(customer, initialTransaction);
        } else {
            System.out.println("Branch " + branch + " not found");
        }
    }

    private int branchIndex(String branch) {
        int index = -1;
        for (Branch b : branches) {
            if (b.getName().equals(branch)) {
                index = branches.indexOf(b);
                break;
            }
        }
        return index;
    }

    public void addTransaction(String branch, String customer, double transaction) {
        int index = branchIndex(branch);
        if (index > -1) {
            branches.get(index).addTransaction(customer, transaction);
        } else {
            System.out.println("Branch " + branch + " not found");
        }
    }

    public void listCustomersInBranch(String branch, boolean showTransactions) {
        int index = branchIndex(branch);
        if (index > -1) {
            System.out.println("List of customers in branch " + branches.get(index).getName());

            for (Customer c : branches.get(index).getCustomers()) {
                System.out.println(c.getName());

                if (showTransactions) {
                    System.out.println("Transactions: ");
                    for (Double dbl : c.getTransactions()){
                        System.out.println(dbl);
                    }
                }
            }
        }
    }
}