package Chapter6;

public class ex6_56 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println(account.getBalance());
        account.deposit(500);
        account.withdraw(100);
        account.withdraw(1000);
        account.withdraw(400);

        VipCustomer vipAccount = new VipCustomer();
        System.out.println("Credit limit: " + vipAccount.getCreditLimit());
        System.out.println("email: " + vipAccount.getEmail());
        System.out.println("name: " + vipAccount.getName());
        VipCustomer vipAccount2 = new VipCustomer("Bob", "bob@email.com");
        System.out.println("Credit limit: " + vipAccount2.getCreditLimit());
        System.out.println("email: " + vipAccount2.getEmail());
        System.out.println("name: " + vipAccount2.getName());
        VipCustomer vipAccount3 = new VipCustomer("Joe", 5000, "joe@email.com");
        System.out.println("Credit limit: " + vipAccount3.getCreditLimit());
        System.out.println("email: " + vipAccount3.getEmail());
        System.out.println("name: " + vipAccount3.getName());
    }

}
