import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        double speed = Double.parseDouble(scanner.nextLine());;
        double diff = 0;
        double result = length * speed;

        double slowdown = length / 15 * 12.5;
        result += slowdown;

        if (result >= record) {
            diff = result - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }
        else if (result < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", result);
        }
    }
}
