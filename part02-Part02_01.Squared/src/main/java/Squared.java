
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        
        number = number * number;
        
        System.out.println(number);
                
                
        
    }
}
