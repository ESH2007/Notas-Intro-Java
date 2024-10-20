import java.util.Scanner;
public class quiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        
        final int AGE = in.nextInt();
        switch (AGE) {
            case 15:
                System.out.println("Happy 15th!");
                break;
            case 17:
                System.out.println("You have just a perfect age! >:)");
                break;
            case 19:
                System.out.println("Now you are too old :,(");
                break;
        }
    }
}
