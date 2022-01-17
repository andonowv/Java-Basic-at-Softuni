import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double finPr = 0;
        double diff = 0;

        double ROSE = 5;
        double DAHLIA = 3.80;
        double TULIP = 2.80;
        double NARCISSUS = 3;
        double GLADIOUS = 2.50;

        if (type.equals("Roses")){
            finPr = count * ROSE;
            if (count > 80){
                finPr *= 0.90;
            }
        }
        else if (type.equals("Dahlias")) {
            finPr = count * DAHLIA;
            if (count > 90) {
                finPr *= 0.85;
            }
        }

        else if (type.equals("Tulips")){
            finPr = count * TULIP;
            if (count > 80){
                finPr *= 0.85;
            }
        }

        else if (type.equals("Narcissus")){
            finPr = count * NARCISSUS;
            if (count < 120){
                finPr = finPr + 0.15 * finPr;
            }
        }

        else if (type.equals("Gladiolus")){
            finPr = count * GLADIOUS;
            if (count < 80){
                finPr = finPr + finPr * 0.20;
            }
        }

        if (finPr > budget){
            diff = finPr - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
        else {
            diff = budget - finPr;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, type, diff);
        }
    }
}
