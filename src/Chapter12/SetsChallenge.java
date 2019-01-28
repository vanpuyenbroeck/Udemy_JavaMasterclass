package Chapter12;

import java.util.*;

public class SetsChallenge {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    private static Set<HeavenlyBody> stars = new HashSet<>();

    private static boolean addToMap(Map<String, HeavenlyBody> map, HeavenlyBody body){
        String key = mapKey(body);
        map.put(key, body);
        return true;
    }

    private static String mapKey(HeavenlyBody body) {
        return body.getName() + body.getBodyType();
    }

    private static void printMap(Map<String, HeavenlyBody> map) {
        System.out.println("All items in map:");
        for (String key : map.keySet()) {
            System.out.println("\t" + map.get(key).getName());
        }
    }

    public static void main(String[] args) {
        HeavenlyBody temp = new Planet("Mercury", 88);
        addToMap(solarSystem, temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        addToMap(solarSystem, temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        addToMap(solarSystem, temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Luna", 27);
        addToMap(solarSystem, temp);
        temp.addMoon(tempMoon);

        temp = new Planet("Mars", 687);
        addToMap(solarSystem, temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        addToMap(solarSystem, temp);
        temp.addMoon(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 0.3);
        addToMap(solarSystem, temp);
        temp.addMoon(tempMoon); // temp is still Mars

        temp = new Planet("Jupiter", 4332);
        addToMap(solarSystem, temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        addToMap(solarSystem, temp);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Europa", 3.5);
        addToMap(solarSystem, temp);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        addToMap(solarSystem, temp);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        addToMap(solarSystem, temp);
        temp.addMoon(tempMoon); // temp is still Jupiter

        temp = new Planet("Saturn", 10759);
        addToMap(solarSystem, temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        addToMap(solarSystem, temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        addToMap(solarSystem, temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        addToMap(solarSystem, temp);
        planets.add(temp);

        temp = new Star("Sol", 0);
        addToMap(solarSystem, temp);
        stars.add(temp);
        for (HeavenlyBody body1 : planets) {
            temp.addMoon(body1);
            for (HeavenlyBody body2 : body1.getSatellites()) {
                temp.addMoon(body2);
            }
        }

        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBody body = solarSystem.get("JupiterPLANET");
        System.out.println("Moons of " + body.getName());
        for (HeavenlyBody jupiterMoon : body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }

        System.out.println("Stars");
        for (HeavenlyBody star : stars) {
            System.out.println("\t" + star.getName());
        }

        System.out.print("Pluto orbital period: ");
        System.out.println(solarSystem.get("PlutoPLANET").getOrbitalPeriod());

        HeavenlyBody pluto = new Planet("Pluto", 842);
        addToMap(solarSystem, pluto);
        planets.add(pluto);

        for(HeavenlyBody planet : planets) {
            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
        }

        printMap(solarSystem);

        System.out.print("Pluto orbital period: ");
        System.out.println(solarSystem.get("PlutoPLANET").getOrbitalPeriod());

    }
}
