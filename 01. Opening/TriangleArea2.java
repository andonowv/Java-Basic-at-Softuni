import java.util.Scanner;

public class TriangleArea2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double side = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());

        double result = (side * height ) / 2;

        System.out.printf("%.2f", result);
    }
}
