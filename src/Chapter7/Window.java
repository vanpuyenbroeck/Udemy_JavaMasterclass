package Chapter7;

import java.awt.*;

public class Window {
    private boolean isOpen;
    private Dimension size;

    public Window(boolean isOpen, Dimension size) {
        this.isOpen = isOpen;
        this.size = size;
    }

    void openWindow(){
        isOpen = true;
        System.out.println("The window is open");
    }
}
