import java.text.NumberFormat;
import java.util.Random;
import java.util.*;

public class Main {
    public static void main(String [] args){
        //Weight conversion / kg to pounds and vice versa
        Scanner scanner = new Scanner(System.in);
        double kg;
        double pounds;
        double calculation;
        String result;
        double factor = 2.2;

        System.out.print("what is your base unit: ");
        String measurement = scanner.nextLine();

        if(measurement.equalsIgnoreCase("kg")){
            System.out.print("Enter your calculation in KG: ");
            kg = scanner.nextDouble();
            calculation = kg * factor;
            System.out.printf("%.0f Pounds converted to kg is %.2f Kg", kg, calculation);
        }
        else if(measurement.equalsIgnoreCase("pounds")){
            System.out.print("Enter you calculation in pounds: ");
            pounds = scanner.nextDouble();
            calculation = pounds / factor;
            System.out.printf("%.0f Kg converted to kg is %.2f Pounds", pounds, calculation);
        }else{
            System.out.println("You can only enter kg and pounds");
        }

        scanner.close();
    }
}
