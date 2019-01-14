package Chapter6;

public class Car extends Vehicle {

    private int gear;

    public void setGear(int gear) {
        this.gear = gear;
    }

    public Car(double speed, double direction, int gear) {
        super(speed, direction);
        this.gear = gear;
    }
}
