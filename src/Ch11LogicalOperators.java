import java.util.Random;
import java.util.Scanner;

public class Ch11LogicalOperators {

    public static final String CELSIUS = "\u2103";

    public static void main(String[] args) {
        //logical operators = used to connect two or more expressions
        //  && = (AND) both conditions must be true
        andTest();
        //  || = (OR) either condition must be true
        //  ! = (NOT) reverses boolean value of condition
        orTest();
    }

    private static void andTest() {
        int temp = randTemp();
        if (temp>30) {
            System.out.print("It is hot outside "+temp);
        }
        else if(temp>=20 && temp<=30) {
            System.out.print("It is warm outside "+temp);
        }
        else {
            System.out.print("It is cold outside "+temp);
        }
        System.out.println(CELSIUS);
    }

    private static void orTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! Press q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        }
        else {
            System.out.println("You are still playing the game *pew pew*");
        }

    }

    public static int randTemp() {
        Random random = new Random();
        return random.nextInt(50);
    }
}
