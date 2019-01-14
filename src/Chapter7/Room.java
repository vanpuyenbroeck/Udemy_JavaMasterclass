package Chapter7;

public class Room extends House {
    private Window roomWindow;
    private Light roomLight;

    public Room(String adress, Window roomWindow, Light roomLight) {
        super(adress);
        this.roomWindow = roomWindow;
        this.roomLight = roomLight;
    }

    public void getFreshAir() {
        roomWindow.openWindow();
    }

    public void turnLightOn(){
        roomLight.turnOn();
    }
}
