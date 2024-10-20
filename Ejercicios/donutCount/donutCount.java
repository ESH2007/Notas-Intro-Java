import java.util.Scanner;
import java.lang.Math;
public class donutCount
{
    public static void main(String[] args) {
        while (true) {
            // Constants for the price of a donut
            final int PRICE_DONUT = 2;
            final int PRICE_DONUT_DOZEN = 16;

            // Input statements
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of doughnuts: ");
            int donutC = scan.nextInt();


            if (donutC >= 12) {
                int dozenQ = Math.round(donutC/12); // The quantity of dozens=totalDonuts/12 -> without the decimal value
                int donutQ = donutC - (dozenQ*12);
                int totalP = (donutQ*PRICE_DONUT) + (dozenQ * PRICE_DONUT_DOZEN);
                System.out.println(donutC + " doughnuths cost $" + totalP);
            }
            else if (donutC == 0) {
                break;
            }
            else {
                int totalP = (donutC*PRICE_DONUT);
                System.out.println(donutC + " doughnuths cost $" + totalP);
            }
        }
    }
}
