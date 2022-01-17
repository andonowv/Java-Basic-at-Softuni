import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double frst = Double.parseDouble(scanner.nextLine());
        double scnd = Double.parseDouble(scanner.nextLine());

        if (frst >= scnd){
            System.out.printf("%.0f",frst);
        }
        else {
            System.out.printf("%.0f",scnd);
        }
    }
}
