
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        String star = "*";
        int i = 0;
        while (i < array.length) {
            int number = array[i];
            for (int j = 0; j < number; j++) {
                System.out.print(star);
                
            }
            System.out.println();
            i++;
        }

    }

}
