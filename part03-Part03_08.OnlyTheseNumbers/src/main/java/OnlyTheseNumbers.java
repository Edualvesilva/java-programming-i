
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("From where?");
                int range1 = Integer.valueOf(scanner.nextLine());

                System.out.println("To where?");
                int range2 = Integer.valueOf(scanner.nextLine());

                for (int i = range1; i <= range2; i++) {
                    System.out.println(numbers.get(i));
                }

                break;
            }

            numbers.add(number);
        }

    }
}
