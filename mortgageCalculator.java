package Java;

import java.text.NumberFormat;
import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.print("Principal: ");
        Scanner principalInput =  new Scanner(System.in);
        long principal = principalInput.nextLong();

        System.out.print("Annual Interest Rate: ");
        // Interest result in bracket to avoid assigment errors in interest variable
        double interest = ((principalInput.nextDouble()/100)/12);

        System.out.print("Period (Years): ");
        int period = (principalInput.nextInt()) * 12;

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        Double  mortgage = (principal * (interest * Math.pow(1 + interest, period))/(Math.pow(1 + interest, period) - 1));
        String displayMortgage = currencyFormat.format(mortgage);
        System.out.println("Mortgage: "  + displayMortgage);
    }
}
