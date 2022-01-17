import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        if (figure.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            double result = side * side;
            System.out.printf("%.3f",result);
        }
        else if (figure.equals("rectangle")){
            double side = Double.parseDouble(scanner.nextLine());
            double scndSide = Double.parseDouble(scanner.nextLine());
            double res = side * scndSide;
            System.out.printf("%.3f", res);
        }
        else if (figure.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            double res = Math.PI * radius * radius;
            System.out.printf("%.3f",res);
        }
        else if (figure.equals("triangle")){
            double side = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            double res = side * h / 2;
            System.out.printf("%.3f",res);
        }
    }
}
