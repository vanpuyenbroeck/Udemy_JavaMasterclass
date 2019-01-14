package Chapter6;

public class SportsCar extends Car {

    private boolean isStreetLegal;

    public SportsCar(double speed, double direction, int gear, boolean isStreetLegal) {
        super(speed, direction, gear);
        this.isStreetLegal = isStreetLegal;
    }

    public void setStreetLegal(boolean isStreetLegal) {
        this.isStreetLegal = isStreetLegal;
    }
}
