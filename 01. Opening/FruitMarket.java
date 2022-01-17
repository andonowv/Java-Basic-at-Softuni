import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double berriesPrice = Double.parseDouble(scan.nextLine());
        double bananasWeight = Double.parseDouble(scan.nextLine());
        double orangesWeight = Double.parseDouble(scan.nextLine());
        double raspberriesWeight = Double.parseDouble((scan.nextLine()));
        double berriesWeight = Double.parseDouble(scan.nextLine());

        double raspberriesPrice = berriesPrice * 0.5;
        double orangePrice = 0.6 * raspberriesPrice;
        double bananaPrice = raspberriesPrice * 0.2;

        double sum = berriesPrice * berriesWeight + bananasWeight * bananaPrice + orangePrice * orangesWeight + raspberriesPrice * raspberriesWeight;
        System.out.printf("%.2f",sum);
    }
}
