import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double squareMeters = Double.parseDouble(scan.nextLine());

        double result = squareMeters * 7.61;
        double discount = 0.18 * result;
        double finalResult = result - discount;

        System.out.println("The final price is: " + finalResult +" lv.");
        System.out.println("The discount is: " + discount +" lv.");
    }
}
