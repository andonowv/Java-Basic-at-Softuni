import java.util.Scanner;

public class WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double digit = Double.parseDouble(scanner.nextLine());

        if (digit >= 5.00 && digit <= 11.9){
            System.out.println("Cold");
        }
        else if (digit >= 12.00 && digit <= 14.99){
            System.out.println("Cool");
        }
        else if (digit >= 15.00 && digit <= 20.00){
            System.out.println("Mild");
        }
        else if (digit >= 20.01 && digit <= 25.90){
            System.out.println("Warm");
        }
        else if (digit >= 26.00 && digit <= 35.00){
            System.out.println("Hot");
        }
        else {
            System.out.println("unknown");
        }
    }
}
