import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PUZZLE = 2.60;
        double DOLL = 3;
        double BEAR = 4.10;
        double MINION = 8.20;
        double TRUCK = 2;

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollCount = Integer.parseInt(scanner.nextLine());
        int bearCount = Integer.parseInt(scanner.nextLine());
        int minionCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());

        int sumCount = puzzleCount + dollCount + bearCount + minionCount + truckCount;

        double sum = puzzleCount * PUZZLE + dollCount * DOLL + bearCount * BEAR + minionCount * MINION + truckCount * TRUCK;

        if (sumCount >= 50){
            sum = sum * 0.75;
        }

        sum *= 0.90;

        if (sum >= tripPrice){
            double remain = sum - tripPrice;
            System.out.printf("Yes! %.2f lv left.", remain);
        }
        else {
            double shortage = tripPrice - sum;
            System.out.printf("Not enough money! %.2f lv needed.", shortage);
        }
    }
}