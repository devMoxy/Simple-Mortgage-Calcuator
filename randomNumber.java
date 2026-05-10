import java.util.*;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Random random =  new Random();
        boolean found = false;
        int guess;
        int attempts = 0;

        int randomNo =  random.nextInt(1,10);



        do{
            System.out.print("Enter guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess > randomNo) {
                System.out.printf("Your guess %d is greater than random number\n", guess);
            }else if(guess < randomNo){
                System.out.printf("Your guess %d is less than random number\n", guess);
            }else{
                System.out.printf("Your guess is correct and you did it in %d attempts\n", attempts);
                found = true;
            }
        }while(!found);
    }
}
