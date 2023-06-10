public class Ch15Arrays {
    public static void main(String[] args) {
        //array = used to store multiple values in a single variable

        String[] cars = {"Camaro","Corvette","Tesla","BMW"};

        cars[0] = "Mustang";
        // try {
        //     System.out.println(cars[4]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println(e.getMessage()+" -> index out of bound");
        // }

        for( String car : cars) {
            System.out.println(car);
        }

    }
}
