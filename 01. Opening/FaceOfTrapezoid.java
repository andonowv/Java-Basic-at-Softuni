import java.util.Scanner;

public class FaceOfTrapezoid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstSide = Double.parseDouble(scanner.nextLine());
        double secondSide = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble((scanner.nextLine()));

        double result = ((firstSide + secondSide) * height) / 2;
        System.out.printf("%.2f", result);
    }
}
