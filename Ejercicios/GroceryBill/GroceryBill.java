
/**
 * Write a description of class GroceryBill here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class GroceryBill
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double  SC = 0.89;
        final double CC = 1.19;
        
        System.out.print("Enter the number of cans of soup: ");
        int sQuant = scan.nextInt();
        
        System.out.print("Enter the number of packages of crackers: ");
        int cQuant = scan.nextInt();
        
        double soupTotal = sQuant * SC;
        double crackersTotal = cQuant * CC;
        double totalBill = soupTotal + crackersTotal;
        
        String soupStr = "%d can(s) of soup: %,3.2f";
        System.out.println(String.format(soupStr, sQuant, soupTotal));
        
        String cracekrsStr = "%d package(s) of crackers: %,3.2f";
        System.out.println(String.format(cracekrsStr, cQuant, crackersTotal));
        
        String totalStr = "Total: %,3.2f";
        System.out.println(String.format(totalStr, totalBill));
    }
}
