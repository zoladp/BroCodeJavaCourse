import java.util.Random;

public class Ch08RandomValues {
    public static void main(String[] args) {
        random();
    }

    public static void random() {
        Random random = new Random();

        int x = random.nextInt();
        System.out.println(x);
    }
}
