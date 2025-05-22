
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        try ( Scanner scanner = new Scanner(Paths.get(file))) {
            int totalGames = 0;
            int win = 0;
            int lost = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];

                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);

                if (homeTeam.equals(team) || awayTeam.equals(team)) {

                    totalGames++;

                    if (homeTeam.equals(team) && homeScore > awayScore) {
                        win++;
                    } else if (awayTeam.equals(team) && awayScore > homeScore) {
                        win++;
                    } else {
                        lost++;
                    }
                }

            }
            System.out.println("Games: " + totalGames);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + lost);
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

    }

}
