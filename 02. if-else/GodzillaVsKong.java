import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double extrasCount = Double.parseDouble(scanner.nextLine());
        double wearPrice = Double.parseDouble(scanner.nextLine());
        double money = 0;

        double decorPrice = budget * 0.10;

        if (extrasCount > 150)
            wearPrice *= 0.9;

        double neededBudget = extrasCount * wearPrice + decorPrice;

        if (neededBudget > budget) {
            money = neededBudget - budget;
            System.out.printf("Not enough money!");
            System.out.println();
            System.out.printf("Wingard needs %.2f leva more.", money);
        }
        if (neededBudget <= budget) {
            money = budget - neededBudget;
            System.out.printf("Action!");
            System.out.println();
            System.out.printf("Wingard starts filming with %.2f leva left.", money);
        }
    }
}
