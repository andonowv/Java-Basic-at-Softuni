import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double frontAndBack = (x * y) * 2 - (1.5 * 1.5) * 2;
        double sideWalls = (x * x) * 2 - (1.2 * 2);
        double totalWalls = frontAndBack + sideWalls;

        double bluePaint = totalWalls / 3.4;

        double redRoof = ((x * y) * 2 + 2 * (x * h / 2)) / 4.3;

        System.out.printf("%.2f", bluePaint);
        System.out.println();
        System.out.printf("%.2f",redRoof);

    }
}
