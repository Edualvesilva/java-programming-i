
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds? ");
        int days = Integer.valueOf(scanner.nextLine());
        
        int one = 86400;
        
        int sum = days * one;
        System.out.println(sum);
        // Write your program here

    }
}
