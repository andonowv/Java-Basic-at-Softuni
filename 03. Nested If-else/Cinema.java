import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();;
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double price = 0;
        int space = rows * columns;

        if (type.equals("Premiere")){
            price = 12;
        }
        else if (type.equals("Normal")){
            price = 7.50;
        }
        else if (type.equals("Discount")){
            price = 5;
        }

        double finPr = price * space;

        System.out.printf("%.2f leva", finPr);
    }
}
