
import java.util.*;
class Guesser {
    private int guesserNum;

    public int guessNumber() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        guesserNum = rand.nextInt(50) + 1; // Random number between 1 and 50
        System.out.println("(Guesser has chosen the number secretly!)");
        return guesserNum;
    }
}

class Player {
    int playerNum;

    public int guessNumber() {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Enter your guess (between 1 and 50): ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num >= 1 && num <= 50) {
                    break;
                } else {
                    System.out.println("Please enter a number within the range 1 to 50.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // consume invalid input
            }
        }
        return num;
    }
}

class Umpire {
    int guesserNum;
    int[] playerScores;
    int totalPlayers = 3;
    int maxAttempts = 3;

    public void startGame() {
        playerScores = new int[totalPlayers];
        Scanner sc = new Scanner(System.in);
        boolean continueGame = true;

        while (continueGame) {
            collectNumFromGuesser();
            collectNumsFromPlayers();
            System.out.println("The actual number was: " + guesserNum); // <--- Added this line
            displayScores();

            System.out.print("Do you want to play another round? (yes/no): ");
            String response = sc.next().toLowerCase();
            if (!response.equals("yes")) {
                continueGame = false;
            }
        }
        System.out.println("\nFinal Scoreboard:");
        displayScores();
        System.out.println("Thanks for playing!");
    }

    public void collectNumFromGuesser() {
        Guesser g = new Guesser();
        guesserNum = g.guessNumber();
    }

    public void collectNumsFromPlayers() {
        for (int i = 0; i < totalPlayers; i++) {
            System.out.println("\nPlayer " + (i + 1) + ", it's your turn!");
            boolean guessedCorrectly = false;
            Player p = new Player();

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                int playerGuess = p.guessNumber();
                if (playerGuess == guesserNum) {
                    System.out.println("Correct guess! 🎉");
                    playerScores[i]++;
                    guessedCorrectly = true;
                    break;
                } else {
                    System.out.println("Wrong guess. Attempts left: " + (maxAttempts - attempt));
                }
            }
            if (!guessedCorrectly) {
                System.out.println("Sorry, Player " + (i + 1) + "! You couldn't guess the correct number.");
            }
        }
    }

    public void displayScores() {
        System.out.println("\n---- Scoreboard ----");
        for (int i = 0; i < totalPlayers; i++) {
            System.out.println("Player " + (i + 1) + ": " + playerScores[i] + " point(s)");
        }
        System.out.println("---------------------\n");
    }
}

public class MyGuesserGame {
    public static void main(String[] args) {
        System.out.println("------- Game Started -------");
        Umpire umpire = new Umpire();
        umpire.startGame();
        System.out.println("------- Game Over -------");
    }
}
