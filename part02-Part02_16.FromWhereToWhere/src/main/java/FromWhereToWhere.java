
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to? ");
        int number1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from? ");
        int number2 = Integer.valueOf(scanner.nextLine());
        
        for(int i = number2; i <= number1; i++){
            System.out.println(i);
        }
    }
}
