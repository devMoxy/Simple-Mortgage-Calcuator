import java.text.NumberFormat;
import java.util.*;
import java.text.*;

public class Main {
    static double balance;
    static Scanner scanner =  new Scanner(System.in);
    static int input;
    static String moneyFormat;
    static NumberFormat format = NumberFormat.getCurrencyInstance();
    static double depositInput;
    static double withdrawalInput;

    public static void main(String [] args){

        boolean running = true;


        while(running){

            boilerPlate();

            switch (input) {
                case 1:
                    balance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("You've exit the program");
                    System.out.println("Good Bye");
                    running =  false;
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }

    }

    static void boilerPlate(){
        System.out.println();
        System.out.println("**********");
        System.out.println("BANKING PROGRAM");
        System.out.println("**********");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("**********");
        System.out.println();
        System.out.print("Enter your choice (1-4): ");
        input = scanner.nextInt();
        System.out.println();
    }

    static void balance(){
        moneyFormat = format.format(balance);
        System.out.printf("Your balance is %s\n", moneyFormat);
    }

    static void deposit(){
        System.out.print("Enter the amount for deposit: ");
        depositInput = scanner.nextDouble();
        balance = depositInput + balance;
        moneyFormat = format.format(depositInput);
        System.out.printf("You have deposited %s", moneyFormat);
        System.out.println("\n");
    }

    static void withdraw(){
        System.out.print("Enter the amount to be withdrawn: ");
        withdrawalInput = scanner.nextDouble();
        balance = balance - withdrawalInput;
        moneyFormat = format.format(withdrawalInput);
        System.out.printf("You have withdrawn %s", moneyFormat);
        System.out.println("\n");
    }

}
