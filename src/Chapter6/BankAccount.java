package Chapter6;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phone;

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void deposit(int amount) {
        this.balance += amount;
        System.out.println("Current balance is " + this.balance);
    }
    public void withdraw(int amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient funds");
        }else {
            this.balance -= amount;
            System.out.println("Current balance is " + this.balance);
        }
    }
}
