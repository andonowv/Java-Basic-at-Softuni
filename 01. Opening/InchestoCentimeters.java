import java.util.Scanner;

public class InchestoCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inches = Double.parseDouble(scanner.next());

        double cm = inches * 2.54;

        System.out.println(cm);
    }
}
