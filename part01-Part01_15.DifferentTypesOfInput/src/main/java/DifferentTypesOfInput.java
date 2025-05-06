
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String test1 = scan.nextLine();
        
        System.out.println("Give an integer: ");
        int test2 = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double: ");
        double test3 = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean: ");
        boolean test4 = Boolean.valueOf(scan.nextLine());        
                
        
        System.out.println("You gave the string "+test1);
        System.out.println("You gave the integer "+test2);
        System.out.println("You gave the double "+test3);
        System.out.println("You gave the boolean "+test4);
        
    }
}
