
import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for?");
        int searching = Integer.valueOf(scanner.nextLine());

        // Implement the search functionality here
        int i = 0;
        boolean isit = false;
        while (i < array.length) {

            if (searching == array[i]) {
                isit = true;
                System.out.println(searching + " is at index " + i+".");
                break;
            }

            i++;
        }

        if (isit == false) {
            System.out.println(searching + " was not found");
        }

    }

}
