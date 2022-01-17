import java.util.Scanner;

public class deposit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double depositedMoney = Double.parseDouble(scan.nextLine());
        int months = Integer.parseInt(scan.nextLine());
        double annualPercentage = Double.parseDouble(scan.nextLine());

        double sum = depositedMoney + months * ((depositedMoney * annualPercentage/100)/12);
        System.out.println(sum);
    }
}
