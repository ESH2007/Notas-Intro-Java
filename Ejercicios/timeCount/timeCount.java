import java.util.Scanner;
public class timeCount {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in); // Initialization of Scanner class
            System.out.println("Enter the seconds: ");
            int seconds = scan.nextInt(); // Input
            // Initialization of all the variables
            final int INITIAL_SECS = seconds;
            int hoursC = 0;
            int minutesC = 0;

            while (seconds > 60) {
                // If the total seconds are more than 3600, there is at least one hour
                if (seconds >= 3600) {
                    hoursC++;
                    seconds -= 3600;
                }
                else if (seconds >= 60) {
                    minutesC++;
                    seconds -= 60;
                }
            }
            System.out.println(INITIAL_SECS + " seconds is " + hoursC + " hours, " + minutesC + " minutes, and " + seconds + " seconds");
        }
}
}
