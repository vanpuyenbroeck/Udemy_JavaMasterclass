package Chapter7;

import java.awt.*;

public class ex7_69 {
    public static void main(String[] args) {
        Dimension windowDimension = new Dimension(1,1);
        Window eastWindow = new Window(false,windowDimension);
        Light ceilingLamp = new Light("Philips", 10);

        Room bedroom = new Room("FirstStreet",eastWindow,ceilingLamp);

        bedroom.getFreshAir();
        bedroom.turnLightOn();
    }
}
