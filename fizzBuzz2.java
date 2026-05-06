package Java;

import java.text.NumberFormat;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner guessInput = new Scanner(System.in);
        System.out.print("Number: ");
        double number = guessInput.nextDouble();
        double fizz = number/3;
        double buzz = number/5;
        if(fizz == Math.floor(fizz) && buzz == Math.floor(buzz)){
            System.out.println("FizzBuzz");
        }else if(fizz == Math.floor(fizz)){
            System.out.println("Buzz");
        }else if(buzz == Math.floor(buzz)){
            System.out.println("Fizz");
        }else{
            System.out.println(number);
        }
    }
}
