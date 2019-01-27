package Chapter12;

public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, "PLANET");
    }

    @Override
    public boolean addMoon(HeavenlyBody moon) {
        if (moon.getBodyType().equals("MOON")){
            return super.addMoon(moon);
        }
        return false;
    }
}
