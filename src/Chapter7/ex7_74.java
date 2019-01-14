package Chapter7;

public class ex7_74 {
    public static void main(String[] args) {
        Burger basicBurger = new Burger();

        basicBurger.addJalapeno();
        basicBurger.addLettuce();
        basicBurger.totalPrice();

        HealthyBurger healthyBurger = new HealthyBurger();

        healthyBurger.addCurlySalad();
        healthyBurger.addPickle();
        healthyBurger.addJalapeno();
        healthyBurger.totalPrice();

        DeluxeBurger deluxeBurger = new DeluxeBurger();

        deluxeBurger.addLettuce();
        deluxeBurger.totalPrice();

        HealthyBurger getAllTheAdditions = new HealthyBurger();

        getAllTheAdditions.addCurlySalad();
        getAllTheAdditions.addCucumber();
        getAllTheAdditions.addJalapeno();
        getAllTheAdditions.addLettuce();
        getAllTheAdditions.addPickle();
        getAllTheAdditions.addTomato();
        getAllTheAdditions.totalPrice();
    }

}
