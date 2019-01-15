package Chapter8;

public class ex8_90 {

    public static void main(String[] args) {

        Bank myBank = new Bank("Big Bank");

        myBank.addBranch("New York");
        myBank.addBranch("Boston");

        myBank.addCustomer("New York", "Joe", 123.45);
        myBank.addCustomer("New York", "Bob", 23.5);
        myBank.addCustomer("LA", "Bob", 45.5);

        myBank.listCustomersInBranch("New York",false);

        myBank.addTransaction("New York", "Bob", 10.25);
        myBank.addTransaction("New York", "Joe", 50.25);
        myBank.addTransaction("New York", "Mike", 50.25);

        myBank.listCustomersInBranch("New York",true);

    }
}
