package Chapter6;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer() {
        this("Default name", 1000, "Default email");
        System.out.println("empty constructor called");
    }

    public VipCustomer(String name, String email) {
        this(name, 1000, email);
        System.out.println("constructor called with default credit limit");
    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("constructor called with 3 arguments");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
