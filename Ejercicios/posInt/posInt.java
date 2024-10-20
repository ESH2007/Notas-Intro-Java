import java.util.Scanner;
public class posInt {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in); // Initialization of Scanner class 
            System.out.println("Enter a positive two-digit integer: ");
            String num = scan.nextLine(); // Input 

            char numChar1 = num.charAt(0); // Division of the two ints
            char numChar2 = num.charAt(1);

            int num1 = numChar1 - '0'; // Convert both chars to ints
            int num2 = numChar2 - '0';

            System.out.println(num1 + " + " + num2 + " = " + (num1+num2)); 
        }
    }
}
