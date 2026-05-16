import java.util.*;

public class Main {

    public static void main(String [] args){
        Scanner scanner =  new Scanner(System.in);
        Random random = new Random();
        int diceCount;
        int randomRoll;
        int total = 0;

        System.out.print("Enter the amount of dice(s) to be rolled: ");
        diceCount = scanner.nextInt();

        if(diceCount > 0){
            for(int i = 0; i < diceCount; i++){
                randomRoll = random.nextInt(1,7);
                System.out.printf("You rolled %d", randomRoll);
                printDie(randomRoll);
                total += randomRoll;
            }
            System.out.printf("\nYour total roll is %d",total);
        }
        else{
            System.out.println("At least 1 dice needs to be rolled");
        }


    }

    static void printDie(int randomRoll){

        String dice1 = """
                
                --------
                |      |
                |  ●   |
                |      |
                --------
                """;
        String dice2 = """
                
                --------
                | ●    |
                |      |
                |    ● |
                --------
                """;
        String dice3 = """
                
                --------
                |●     |
                |  ●   |
                |    ● |
                --------
                """;
        String dice4 = """
                
                --------
                |●   ● |
                |      |
                |●   ● |
                --------
                """;
        String dice5 = """
                
                --------
                |●   ● |
                |  ●   |
                |●   ● |
                --------
                """;
        String dice6 = """
                
                --------
                |●     ●|
                |●     ●|
                |●     ●|
                --------
                """;
        switch(randomRoll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }
    }

}
