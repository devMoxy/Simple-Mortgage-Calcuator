import java.text.NumberFormat;
import java.util.Random;
import java.util.*;

public class Main {
    public static void main(String [] args){
// Varibles 
        int id1 = 1;
        int rows = 6;
        String val = "1";
        String space = " ";
        int numCount = 1;
        int spaceCount = 6;
// Method 1 
        System.out.printf("%6d\n", id1);
        System.out.printf("%5d%d%d\n", id1,id1, id1);
        System.out.printf("%4d%d%d%d%d\n", id1,id1, id1, id1, id1);
        System.out.printf("%3d%d%d%d%d%d%d\n", id1,id1, id1, id1, id1,id1, id1);
        System.out.printf("%2d%d%d%d%d%d%d%d%d\n", id1,id1, id1, id1, id1, id1,id1, id1, id1);
        System.out.printf("%1d%d%d%d%d%d%d%d%d%d%d\n", id1,id1, id1, id1, id1, id1, id1, id1, id1, id1, id1);

// Method 2
        for(int i = 1; i <= 6; i++){
            for(int j = 0; j < (6 - i);j++){
                System.out.print(" ");
            }for(int k = 0; k < (i * 2 - 1); k++){
                System.out.print(id1);
            }
            System.out.println();
        }

// Method 3
        for(int i = 1; i <= rows; i++){
            int spaces = rows - i;
            System.out.print(" ".repeat(spaces));

            int count = (i * 2) - 1;

            String text = String.valueOf(id1).repeat(count);

            System.out.println(text);
        }
// Method 4
        for(int i = 1; i <= rows; i++){
         spaceCount--;
            System.out.print(space.repeat(spaceCount));

            System.out.printf("%s\n",val.repeat(numCount));
            numCount +=2;
        }

    }
}
