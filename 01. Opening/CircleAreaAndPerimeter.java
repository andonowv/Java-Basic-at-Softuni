import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = Double.parseDouble(scanner.nextLine());

        double result = Math.PI * radius * radius;
        double length  = 2 * Math.PI * radius;

        System.out.printf("%.2f", result);
        System.out.println();
        System.out.printf("%.2f",length);
    }
}
