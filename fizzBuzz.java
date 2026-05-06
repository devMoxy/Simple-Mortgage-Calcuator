package Java;

import java.text.NumberFormat;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner guessInput = new Scanner(System.in);
        System.out.print("Number: ");
        int number = guessInput.nextInt();
        if(number % 5 == 0 && number % 3 == 0){
            System.out.println("FizzBuzz");
        }else if(number % 3 == 0){
            System.out.println("Buzz");
        }else if(number % 5 == 0){
            System.out.println("Fizz");
        }else{
            System.out.println(number);
        }
    }
}
