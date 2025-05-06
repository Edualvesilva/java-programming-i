
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("give a number: ");
        int number = Integer.valueOf(scanner.nextLine());

        if (number < 0) {
            int sum = number * -1;
            System.out.println(sum);
        } else {
            System.out.println(number);
        }
    }
}
