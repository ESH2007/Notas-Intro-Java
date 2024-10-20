
/**
 * Write a description of class SwitchExample here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SwitchExample
{
    public static void main(String[] args) {
        int age = 17;
        switch(age){
            case 10:
                System.out.println("You are to young!");
                break;
            case 15:
                System.out.println("You are a bit young!");
                break;
            case 17:
                System.out.println("You have just the perfect age >:)");
                break;
            case 20:
                System.out.println("You are to old!");
            default:
                System.out.println("Your age is not valid");
        }

    }
}