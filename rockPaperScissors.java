import java.util.*;

public class Main {
    static Scanner scanner =  new Scanner(System.in);
    static boolean playAgain = false;
    static String continueGame;
    static String computerMove = "";
    static String result = "";
    static String playerMove;
    static int score = 0;
    static int attempts = 0;
    static boolean played = false;

    public static void main(String[] args) {
        Random random = new Random();

        int randomNo;

        do{
            randomNo = random.nextInt(0, 3);
            switch (randomNo) {
                case 0 -> computerMove = "rock";
                case 1 -> computerMove = "paper";
                case 2 -> computerMove = "scissors";
            }

            System.out.print("Enter your move (rock, paper, scissors): ");
            playerMove = scanner.nextLine().trim();
            attempts++;

            while(!(playerMove.equalsIgnoreCase("rock") || playerMove.equalsIgnoreCase("paper") || playerMove.equalsIgnoreCase("scissors"))) {
                System.out.println("Invalid Input");
                System.out.print("Enter your move (rock, paper, scissors): ");
                playerMove = scanner.nextLine().trim();
            }
            played = true;

            System.out.printf("\nComputer chooses %s\n", computerMove);

            gameLogic();

            play();
        }while(playAgain);

        if(played){
            System.out.printf("Your final score is %d out of %d attempt(s)", score, attempts);
        }

    }
    static void gameLogic(){
        if (playerMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("paper")) {
            result = "You Lose!";
        } else if (playerMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors")) {
            result = "You Win!";
            score++;
        } else if (playerMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock")) {
            result = "You Win!";
            score++;
        } else if (playerMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("scissors")) {
            result = "You Lose!";
        } else if (playerMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("rock")) {
            result = "You Lose!";
        } else if (playerMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("paper")) {
            result = "You Win!";
            score++;
        } else if (playerMove.equalsIgnoreCase(computerMove)) {
            result = "You Tie!";
        } else {
            System.out.println("Error with program");
        }

        System.out.println(result);
    }

    static void play(){
        System.out.print("Play again (yes/no): ");
        continueGame = scanner.nextLine().trim();

        if(continueGame.equalsIgnoreCase("yes")){
            playAgain = true;
        }else if(continueGame.equalsIgnoreCase("no")){
            playAgain = false;
        }
        else{
            while(!(continueGame.equalsIgnoreCase("yes") || continueGame.equalsIgnoreCase("no"))){
                System.out.println("Invalid Input");
                System.out.print("Play again (yes/no): ");
                continueGame = scanner.nextLine().trim();
                if(continueGame.equalsIgnoreCase("yes")){
                    playAgain = true;
                }else if(continueGame.equalsIgnoreCase("no")){
                    playAgain = false;
                }
            }
        }
    }
}
