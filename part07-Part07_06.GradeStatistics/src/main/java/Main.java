
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeDistribution grades = new GradeDistribution();
        int total = 0;
        double avg = 0;
        int i = 0;
        double passingAvg = 0;
        int totalPassing = 0;
        int j = 0;
        double passPercentage = 0;
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        while (true) {
            System.out.println("Enter points total,-1 stops:");
            int number = Integer.valueOf(scanner.nextLine());
            grades.addPoint(number);
            if (number == -1) {

                if (totalPassing == 0) {
                    System.out.println("Point average (all): " + avg);
                    System.out.println("-");
                    System.out.println("Pass percentage: 0.0");
                    break;
                }

                break;
            }

            if (number < 0 || number > 100) {
                continue;
            }

            total += number;
            
            i++;

            if (number >= 50) {
                totalPassing += number;
                j++;

            }

        }
        avg = total / i;
        passingAvg = totalPassing / j;
        passPercentage = 100.0 * j / i;
        
        System.out.println("Point average (all): " + avg);
        System.out.println("Point average (passing): " + passingAvg);
        System.out.println("Pass percentage: " + passPercentage);
        grades.printDistribution();

    }
}
