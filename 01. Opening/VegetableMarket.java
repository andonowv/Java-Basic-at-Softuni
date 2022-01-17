import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        double priceVegetable = Double.parseDouble(Scanner.nextLine());
        double priceFruits = Double.parseDouble(Scanner.nextLine());
        double totalVegetable = Double.parseDouble(Scanner.nextLine());
        double totalFruits = Double.parseDouble(Scanner.nextLine());

        double total = ((priceVegetable * totalVegetable) + (priceFruits * totalFruits)) / 1.94;
        System.out.printf("%.2f", total);
    }
}
