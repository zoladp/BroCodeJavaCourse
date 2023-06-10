public class Ch162DArrays {
    public static void main(String[] args) {
        //2D array = an array of arrays

        String[][] cars = {
                {"Camaro", "Corvette", "Silverado"},
                {"Mustnag", "Ranger", "F-150"},
                {"Ferrari", "Lambo", "Tesla"}};

        for (int i = 0; i<cars.length; i++) {
            for (int j = 0; j<cars[i].length; j++) {
                System.out.print(cars[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
