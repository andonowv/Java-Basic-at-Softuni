import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double horseMackerelKg = Double.parseDouble(scanner.nextLine());
        double musselsKg = Double.parseDouble(scanner.nextLine());

        double bonitoPrice = mackerelPrice + (mackerelPrice * 0.60);
        double horseMackerelPrice = toyPrice + (toyPrice * 0.80);
        double musselsPrice = 7.50;

        double result = (bonitoKg * bonitoPrice) + (horseMackerelKg * horseMackerelPrice) + (musselsPrice * musselsKg);
        System.out.printf("%.2f", result);
    }
}
