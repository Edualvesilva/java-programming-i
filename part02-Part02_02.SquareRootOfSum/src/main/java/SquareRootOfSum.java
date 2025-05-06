
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        
        System.out.println("write second number: ");
        int second = Integer.valueOf(scanner.nextLine());
        
        double sum = first + second;
        
        double square = Math.sqrt(sum);
        
        System.out.println(square);
        
        
        
    }
}
