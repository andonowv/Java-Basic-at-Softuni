import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("NoMoreMoney")){
            double money = Double.parseDouble(input);

            if (money > 0){
                sum += money;
                System.out.printf("Increase: %.2f", money);
                System.out.println();
            }
            else {
                System.out.printf("Invalid operation!");
                System.out.println();
                break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
