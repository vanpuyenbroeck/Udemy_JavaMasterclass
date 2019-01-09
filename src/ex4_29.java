import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.HashMap;
import java.util.Map;

public class ex4_29 {
    public static void main(String[] args) {
        Map<String,Integer> playersAndScores = new HashMap<>();
        playersAndScores.put("John", 1500);
        playersAndScores.put("Bob", 900);
        playersAndScores.put("Alice", 400);
        playersAndScores.put("Joe", 50);

        playersAndScores.forEach((key, value) -> displayHighscorePosition(key, calculateHighscorePosition(value)));
    }

    private static void displayHighscorePosition(String playerName, int tablePosition) {
        System.out.println(playerName + " managed to get to position " + tablePosition);
    }

    private static int calculateHighscorePosition(int playerScore) {
        int playerPosition = 4;

        if (playerScore >= 1000) {
            playerPosition = 1;
        } else if (playerScore >= 500) {
            playerPosition = 2;
        } else if (playerScore >= 100) {
            playerPosition = 3;
        }
        return playerPosition;
    }
}
