package Chapter7;

class Car {
    private boolean engine;
    private int wheels;
    private int cylinders;
    private String name;
    private boolean engineRunning;
    private int speed;
    private int topSpeed;

    public Car(int cylinders, String name) {
        if (cylinders > 1 && cylinders < 16) {
            this.cylinders = cylinders;
        } else {
            this.cylinders = -1;
        }
        this.name = name;
        this.wheels = 4;
        this.engine = true;
        this.engineRunning = false;
        this.speed = 0;
        this.topSpeed = 200;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> Engine started";
    }

    public String accellerate(int speed) {
        if (canAccellerate(speed)) {
            this.speed += speed;
            return "Car -> Accellerated to " + this.speed + " kmh";
        } else {
            return "Car -> Cannot reach that speed";
        }
    }
    private boolean canAccellerate(int speed) {
        return  ((this.speed + speed) < this.topSpeed);
    }

    public String breakTo (int speed) {
        if (speed >= 0 && speed < this.speed) {
            this.speed = speed;
            return "Car -> Reduced speed to " + this.speed + " kmh";
        }else {
            return "Car -> Invalid breaking speed";
        }
    }
}

class Porche extends Car {
    public Porche(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accellerate(int speed) {
        super.accellerate(speed);
        return "Porche -> Accellerated to " + this.getSpeed() + " kmh";
    }

    @Override
    public String startEngine() {
        return "Porche -> Engine started";
    }
}

public class ex7_73 {
    public static void main(String[] args) {
        Car standardCar = new Car(4,"StandardCar");

        System.out.println(standardCar.startEngine());
        System.out.println(standardCar.accellerate(50));
        System.out.println(standardCar.breakTo(30));

        Car nineEleven = new Porche(6, "911");

        System.out.println(nineEleven.startEngine());
        System.out.println(nineEleven.accellerate(150));

    }
}
