import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        double length = Double.parseDouble(Scanner.nextLine()) * 100;
        double width = Double.parseDouble(Scanner.nextLine()) * 100 - 100;

        double newWidth = Math.floor(width / 70) ;
        double newLength = Math.floor(length / 120);

        double result = newLength * newWidth - 3;
        System.out.printf("%.0f", result);
    }
}
