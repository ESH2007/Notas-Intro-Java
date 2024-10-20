import java.util.Scanner;
public class change
{
    public static void main(String[] args) {
        while (true) {
            // All the input statements
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the cents: ");
            int change = scan.nextInt();

            // Initialization of all the variables
            final int INITIAL_CHANGE = change;
            int quaterC = 0;
            int dimeC = 0;
            int nickelC = 0;
            int centsC = 0;

            // The count of quater, dime, nickerls and centsa
            while (change > 0) {
                if(change >= 25) {
                    quaterC++;
                    change -= 25;
                } else if (change > 10 && change < 25) {
                    dimeC++;
                    change -= 10;
                } else if (change >= 5) {
                    nickelC++;
                    change -= 5;
                } else{
                    centsC += change; // add all the restant change, and substract all the restant change from the "change" variable
                    change -= change;
                }
            }
            System.out.println("The coins for " + INITIAL_CHANGE + " cents will be " + quaterC + " quarters, " + dimeC + " dimes, " + nickelC + " nickels, and " + centsC + " pennies.");
        }
    }
}