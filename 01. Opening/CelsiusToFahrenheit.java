import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        double celsuis = Double.parseDouble(Scanner.nextLine());

        double fahrenheit = celsuis * 1.8 + 32;

        System.out.printf("%.2f", fahrenheit);
    }
}
