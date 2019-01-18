package Chapter9;

import java.util.ArrayList;
import java.util.List;

public class Creature implements ISaveable {
    private String name;
    private int power;
    private int toughness;

    public Creature(String name, int power, int toughness) {
        this.name = name;
        this.power = power;
        this.toughness = toughness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", toughness=" + toughness +
                '}';
    }

    @Override
    public List<String> writeState() {
        List<String> list = new ArrayList<>();
        list.add(0, name);
        list.add(1, "" + power);
        list.add(2, "" + toughness);
        return list;
    }

    @Override
    public void readState(List<String> data) {
        name = data.get(0);
        power = Integer.parseInt(data.get(1));
        toughness = Integer.parseInt(data.get(2));
    }
}
