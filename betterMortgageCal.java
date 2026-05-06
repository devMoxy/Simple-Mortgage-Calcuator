package Java;

import java.text.NumberFormat;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int principal;
        float interest;
        int period;
       while(true) {
            System.out.print("Principal (1k - 1m): ");
            principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 1000000){
                break;
            }else{
                System.out.println("Enter a principal between 1000 and 1,000,000");
            }
        }

        while(true){
            System.out.print("Annual Interest Rate: ");
            interest = scanner.nextFloat();
            if(interest >= 1 && interest <= 30){
                interest = (interest /100) / 12;
                break;
            }else{
                System.out.println("Enter an interest rate between 1 and 30");
            }
        }

        while(true){
            System.out.print("Period (Years): ");
            period = scanner.nextInt();
            if(period >= 1 && period <= 30){
                period = period * 12;
                break;
            }else{
                System.out.println("Enter a Period(Years) between 1 and 30");
            }

        }

    double  mortgage = (principal * (interest * Math.pow(1 + interest, period))/(Math.pow(1 + interest, period) - 1));
    NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
    String mortgageFormat = moneyFormat.format(mortgage);
    System.out.println(mortgageFormat);




}}
