import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ch10Switches {
    public static void main(String[] args) {

        randomDay();

        //switch = statement that allows a variable to be tested for equality against a list of values

        // String day = "Friday";
        String day = randomDay();

        switch (day) {
            case "Sunday":
                System.out.println("Its is Sunday!");
                break;
            case "Monday":
                System.out.println("Its is Monday");
                break;
            case "Tuesday":
                System.out.println("Its is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Its is Wednesday");
                break;
            case "Thursday":
                System.out.println("Its is Thursday");
                break;
            case "Friday":
                System.out.println("Its is Friday");
                break;
            case "Saturday":
                System.out.println("Its is Saturday");
                break;
            default:
                System.out.println("This is not a day");

        }
    }

    public static String randomDay() {
        List<String> days = Arrays.asList("Sunday","Monday","Tuesday","Wednesday",
                "Thursday","Friday","Saturday");
        //System.out.println(days.get(0));
        int range = days.size();
        try {
            return days.get(getRandInt(range));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Poza zakresem listy");
            return "r";
        }
    }

    public static int getRandInt(int range) {
        Random random = new Random();
        return random.nextInt(range);
    }

}
