import java.util.*;

public class Main {
    public static void main(String [] args){
        Scanner scanner =  new Scanner(System.in);
        double firstNum;
        double secondNum;
        String operator;
        double result = 0;
        String error = "";
        String text = "";
        boolean isError = false;

        System.out.print("Enter first number: ");
        firstNum = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter an operator (+, -, *, /, ^: ");
        operator = scanner.nextLine();

        System.out.print("Enter the second number: ");
        secondNum = scanner.nextDouble();

    switch(operator){
        case "+":
            result = firstNum + secondNum;
            text = "addition";
            break;
        case "-":
            result = firstNum - secondNum;
            text = "subtraction";
            break;
        case "*":
            result = firstNum * secondNum;
            text = "multiplication";
            break;
        case "/":
            if(secondNum == 0){
                error = "You cannot divide a number by zero(0)";
                isError = true;
            }
            else{
                result = firstNum / secondNum;
                text = "division";
            }
            break;
        case "^":
            result = Math.pow(firstNum, secondNum);
            text = "exponentiation";
            break;
        default:
            error = "Enter a valid operator symbol like +,-,*,/,^";
            isError = true;
        }


    if (isError){
            System.out.printf("%s", error);
    }else{
            System.out.printf("The %s of the %.0f and %.0f is %.1f", text, firstNum, secondNum, result);
        }
    }
}
