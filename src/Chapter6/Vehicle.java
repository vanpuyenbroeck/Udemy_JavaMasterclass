package Chapter6;

public class Vehicle {

    private double speed;
    private double direction;

    public Vehicle(double speed, double direction) {
        this.speed = speed;
        this.direction = direction;
    }

    public void changeSpeed(double speed) {
        this.speed = speed;
    }

    public void steer(double direction) {
        this.direction = direction;
    }

    public void stop() {
        this.speed = 0;
    }
}
