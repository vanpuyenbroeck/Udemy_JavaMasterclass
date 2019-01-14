package Chapter7;

public class Burger {
    private String name;
    private String breadRollType;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean jalapeno;
    private boolean pickle;
    private double basePrice = 2d;
    private static double lettucePrice = 0.3d;
    private static double tomatoPrice = 0.3d;
    private static double jalapenoPrice = 0.5d;
    private static double picklePrice = 0.2d;

    public Burger() {
        this.name = "Basic Burger";
        this.breadRollType = "White bread";
        this.meat = "Beef";
        this.lettuce = false;
        this.tomato = false;
        this.jalapeno = false;
        this.pickle = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void addLettuce() {
        this.lettuce = true;
    }

    public void addTomato() {
        this.tomato = true;
    }

    public void addJalapeno() {
        this.jalapeno = true;
    }

    public void addPickle() {
        this.pickle = true;
    }

    public void totalPrice() {
        this.printBurgerPrice();
        System.out.println("\n" + "Total price: " + this.burgerPrice());
    }

    public void printBurgerPrice() {
        System.out.println("----------" + "\n"
                + name + " " + basePrice + "$" + "\n"
                + "  " + this.breadRollType + "\n"
                + "  " + this.meat);
        if (lettuce) {
            System.out.println("Lettuce: " + lettucePrice + "$");
        }
        if (tomato) {
            System.out.println("Tomato: " + tomatoPrice + "$");
        }
        if (jalapeno) {
            System.out.println("Jalapeno: " + jalapenoPrice + "$");
        }
        if (pickle) {
            System.out.println("Pickle: " + picklePrice + "$");
        }
    }

    public double burgerPrice() {
        double sum = basePrice;
        if (lettuce) {
            sum += lettucePrice;
        }
        if (tomato) {
            sum += tomatoPrice;
        }
        if (jalapeno) {
            sum += jalapenoPrice;
        }
        if (pickle) {
            sum += picklePrice;
        }
        return sum;
    }
}