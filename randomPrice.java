import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner =  new Scanner(System.in);
        // Shopping Cart
        Random random =  new Random();

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        double number;
        double magicPrice = 87.3;
        String numberDisplay;
        boolean found = false;

        do{
            number =  random.nextDouble(1,100);
            System.out.println(formatter.format(number));
            if(Math.abs(number - magicPrice) < 0.005){
                found = true;
            }
        }while(!found);

        System.out.println("found " + formatter.format(number));

    }
}
