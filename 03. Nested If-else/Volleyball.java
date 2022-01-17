import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekendsHome = Integer.parseInt(scanner.nextLine());

        double sfWeekends = 48 - weekendsHome;
        double sfCountGames = sfWeekends * (3.0 / 4);
        double homeCountGames = weekendsHome;
        double holyCountGames = holidays * (2.0 / 3);
        double totalGames = sfCountGames + holyCountGames + homeCountGames;


        if (type.equals("leap")){
            totalGames = Math.floor(totalGames + 0.15 * totalGames);
        }
        else {
            totalGames = Math.floor(totalGames);
        }
        System.out.printf("%.0f",totalGames);
    }
}
