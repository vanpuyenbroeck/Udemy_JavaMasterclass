package Chapter7;

public class Light {
    private String brand;
    private int wattage;
    private boolean isOn;

    public Light(String brand, int wattage) {
        this.brand = brand;
        this.wattage = wattage;
    }

    void turnOn() {
        if(isOn) {
            System.out.println("Light is already on");
        }
        isOn = true;
    }

}
