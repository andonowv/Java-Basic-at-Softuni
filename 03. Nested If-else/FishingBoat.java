import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double finPr = 0;
        double diff = 0;

        if (season.equals("Spring")){
            finPr = 3000;
        }
        else if (season.equals("Summer") || season.equals("Autumn")){
            finPr = 4200;
        }
        else if (season.equals("Winter")){
            finPr = 2600;
        }

        if (count <=6){
            finPr *= 0.90;
        }
        else if (count > 6 && count <=11){
            finPr *= 0.85;
        }
        else if (count > 11){
            finPr *= 0.75;
        }
        else if (count % 2 == 0 && !season.equals("Autumn")){
            finPr *= 0.95;
        }

        if (finPr > budget){
            diff = finPr - budget;
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
        else if (finPr <=budget){
            diff = budget - finPr;
            System.out.printf("Yes! You have %.2f leva left.", diff);
        }
    }
}
