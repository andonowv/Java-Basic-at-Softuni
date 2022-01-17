import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double bonus = 0;

        if (number % 2 == 0){
            bonus +=1;
        }
        else if (number % 5 == 0){
            bonus += 2;
        }

        if (number <= 100){
            bonus += 5;
        }

        else if (number > 100 && number < 1000){
            bonus += 0.2 * number;
        }
        else if (number > 1000){
            bonus += number * 0.1;
        }

        System.out.printf("%.1f",bonus);
        System.out.println("");
        System.out.printf("%.1f", number + bonus);

    }
}
