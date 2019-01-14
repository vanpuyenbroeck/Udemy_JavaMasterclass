package Chapter7;

public class DeluxeBurger extends Burger {
    private boolean chips;
    private boolean drinks;

    public DeluxeBurger() {
        super();
        this.setName("Deluxe burger");
        this.setBasePrice(4d);
        this.chips = true;
        this.drinks = true;
    }

    @Override
    public void addLettuce() {
        System.out.println("Lettuce not allowed on Deluxe burger");
    }

    @Override
    public void addTomato() {
        System.out.println("Tomato not allowed on Deluxe burger");
    }

    @Override
    public void addJalapeno() {
        System.out.println("Jalapeno not allowed on Deluxe burger");
    }

    @Override
    public void addPickle() {
        System.out.println("Pickle not allowed on Deluxe burger");
    }

    @Override
    public void printBurgerPrice() {
        super.printBurgerPrice();
        System.out.println("Chips: 0.0$");
        System.out.println("Drinks: 0.0$");
    }
}