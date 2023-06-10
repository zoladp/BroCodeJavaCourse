import java.util.Scanner;

public class Ch07MathClass {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        System.out.println(Math.max(x, y));
        System.out.println(Math.abs(y));

        double z = Math.sqrt(x);
        System.out.println(z);

        System.out.println("----------------------------");
        hypotenuse();
    }

    public static void hypotenuse() {
        double x, y, z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse is: "+z);

        scanner.close();

    }
}
