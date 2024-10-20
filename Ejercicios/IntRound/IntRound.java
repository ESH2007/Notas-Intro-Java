
import java.lang.Math;
import java.util.Scanner;
public class IntRound
{
    public static void main(String[] args) {
        while (true) {
            // Input statement
            Scanner scan = new Scanner(System.in); 
            System.out.println("Enter a decimal number: ");
            double num1 = scan.nextDouble();

            if (num1 > 0) {
                System.out.println("Rounded decimal: " + Math.round(num1)); // Round the number using the "Math" lib
            } else {
                System.out.println("Please enter a positive decimal");
            }
        }
    }
}
