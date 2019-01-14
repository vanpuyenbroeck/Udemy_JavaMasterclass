package Chapter4;

public class ex4_26 {
    private static int score = 800, levelCompleted = 5, bonus = 100;
    private static boolean gameOver = true;

    public static void main(String[] args) {

        calculateFinalScore();

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateFinalScore();
    }
    private static void calculateFinalScore() {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was: " + finalScore);
        }
    }
}
