package challenges;

public class calculateHighScore {

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Marilize", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Marilize", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Marilize", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Marilize", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int position) {

        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");

    }

    public static int calculateHighScorePosition(int score) {

        // if (score >= 1000) {
        // return 1;
        // }

        // else if (score >= 500) {
        // return 2;
        // }

        // else if (score >= 100) {
        // return 3;
        // }
        // return 4;
        // }

        int position = 4; // assume position 4 will be returned.

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }

}