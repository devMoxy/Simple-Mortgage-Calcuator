import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner =  new Scanner(System.in);
        // Area of a reactangle

        double area;
        double length;
        double width;
        boolean end = false;



        while(!end){
            System.out.print("what is the unknown(area,length,width): ");
            String unknown = scanner.nextLine().toLowerCase();

            if (unknown.equals("area")) {
                System.out.print("Enter your rectangle length: ");
                length = scanner.nextDouble();

                System.out.print("Enter your rectangle width: ");
                width = scanner.nextDouble();

                area = length * width;

                System.out.println("The area of the rectangle is: " + area);
                end = true;
            } else if (unknown.equals("length")) {
                System.out.print("Enter your rectangle area: ");
                area = scanner.nextDouble();

                System.out.print("Enter your rectangle width: ");
                width = scanner.nextDouble();

                length = area / width;

                System.out.println("The length of the rectangle is: " + length);
                end = true;
            } else if (unknown.equals("width")) {
                System.out.print("Enter your rectangle area: ");
                area = scanner.nextDouble();

                System.out.print("Enter your rectangle length: ");
                length = scanner.nextDouble();

                width = area / length;

                System.out.println("The width of the rectangle is: " + width);
                end = true;
            } else {
                System.out.println("Enter your unknown which are area, width or length");
            }
        }



        scanner.close();
    }
}
