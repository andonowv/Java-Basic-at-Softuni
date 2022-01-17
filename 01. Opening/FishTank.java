import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double percentage = Double.parseDouble(scan.nextLine());

        double volume = ((length * width * height) * 0.001) * (1 - percentage / 100);

        System.out.printf("%.2f", volume);
    }
}
