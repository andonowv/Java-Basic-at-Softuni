import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String rating = scanner.nextLine();
        int nights = days - 1;
        double finalPr = 0;

        if (type.equals("room for one person")){
            if (days < 10){
                finalPr = 18;
            }
            else if (days >= 10 && days <= 15){
                finalPr = 18;
            }
            else if (days > 15){
                finalPr = 18;
            }
        }
        else if (type.equals("apartment")){
            if (days < 10){
                finalPr = 25 * 0.70;
            }
            else if (days >= 10 && days <= 15){
                finalPr = 25 * 0.65;
            }
            else if (days > 15){
                finalPr = 25 * 0.50;
            }
        }
        else if (type.equals("president apartment")){
            if (days < 10){
                finalPr = 35 * 0.90;
            }
            else if (days >= 10 && days <= 15){
                finalPr = 35 * 0.85;
            }
            else if (days > 15){
                finalPr = 35 * 0.80;
            }
        }
        if (rating.equals("positive")){
            finalPr = finalPr + finalPr * 0.25;
        }
        else if (rating.equals("negative")){
            finalPr = finalPr - finalPr * 0.10;
        }
        finalPr *= nights;
        System.out.printf("%.2f", finalPr);
    }
}
