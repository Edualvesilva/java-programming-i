
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number? ");
        int n = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        for (int i = 1 ; i <= n; i++) {
            
            sum = sum + i;
            
        }
        System.out.print("The sum is " + sum);

    }
}
