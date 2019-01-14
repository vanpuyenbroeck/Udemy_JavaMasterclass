package Chapter7;

public class HealthyBurger extends Burger {
    private boolean cucumber;
    private boolean curlySalad;
    private static double cucumberPrice = 0.2;
    private static double curlySaladPrice = 0.5;

    public HealthyBurger() {
        super();
        this.setName("Healthy burger");
        this.setBreadRollType("Brown rye bread");
        this.setMeat("Lean beef");
        this.setBasePrice(2.5);
    }

    public void addCucumber() {
        this.cucumber = true;
    }

    public void addCurlySalad() {
        this.curlySalad = true;
    }

    public double getCucumberPrice() {
        return cucumberPrice;
    }

    public double getCurlySaladPrice() {
        return curlySaladPrice;
    }


    @Override
    public void printBurgerPrice() {
        super.printBurgerPrice();
        if (cucumber) {
            System.out.println("Cucumber: " + cucumberPrice+"$");
        }
        if (curlySalad) {
            System.out.println("Curly salad: " + curlySaladPrice+"$");
        }
    }

    @Override
    public double burgerPrice() {
        double sum = super.burgerPrice();
        if (cucumber) {
            sum += cucumberPrice;
        }
        if (curlySalad) {
            sum += curlySaladPrice;
        }
        return sum;
    }
}

