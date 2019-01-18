package Chapter9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex9_102 {
    public static void main(String[] args) {

        Creature monster = new Creature("Spider", 3, 2);
        System.out.println(monster.toString());

        List<String> state = monster.writeState();

        List<String> newState = readValues();
        monster.readState(newState);

        System.out.println(monster.toString());

    }

    public static List<String> saveObjectState(ISaveable object) {
        List<String> states = object.writeState();
        return states;
    }

    public static void loadObjectState(List<String> states, ISaveable object) {
        object.readState(states);
    }

    public static List<String> readValues() {
        List<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int input;

        while (!quit) {
            System.out.println("Chose an option:\n" +
                    "0 - quit\n" +
                    "1 - Enter data");
            input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter new data field:");
                    values.add(scanner.nextLine());
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
        }
        scanner.close();
        return values;
    }
}
