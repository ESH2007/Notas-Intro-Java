import java.util.Scanner;
import java.util.Random;
public class practicaQuiz
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter your Clarification Grade: ");
        double clariGrade = in.nextDouble();
        
        System.out.println("Enter your Synthesis Grade: ");
        double synGrade = in.nextDouble();
        
        double exploGrade = rand.nextDouble() * 100;
        
        double totalGrade = (exploGrade * 0.1) + (clariGrade * 0.3) + (synGrade * 0.6);
        
        String letterGrade = "";
        
        if (totalGrade >= 90 && totalGrade <= 100) {
            letterGrade = "AH";
        }
        else if (totalGrade >= 80 && totalGrade < 90) {
            letterGrade = "H";
        }
        else if (totalGrade >= 70 && totalGrade < 80) {
            letterGrade = "S";
        }
        else if (totalGrade >= 60 && totalGrade < 70) {
            letterGrade = "A";
        }
        else if (totalGrade < 60 && totalGrade > 0) {
            letterGrade = "I";
        } else {
            System.out.println("Invalid value in your Total Grade");
        }
        
        switch (letterGrade) {
            case "AH":
                System.out.println("Congratulations for your outstanding performance with your AH total grade!");
                break;
            case "H":
                System.out.println("Congratulations for your great performance with you H total grade!");
                break;
            case "S":
                System.out.println("Congratulations for your good performance with you S total grade!");
                break;
            case "A":
                System.out.println("You may study more, due to your A total grade");
                break;
            case "I":
                System.out.println("You must study more because you lose this class with your I total grade");
                break;
        }
        System.out.println(String.format("Your final/total grade is: %3.2f\n Which corresponds to the letter: %S", totalGrade, letterGrade));
    }
}
