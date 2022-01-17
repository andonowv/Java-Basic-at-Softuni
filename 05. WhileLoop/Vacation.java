import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double needMoney = Double.parseDouble(scanner.nextLine());
        double cash = Double.parseDouble(scanner.nextLine());
        int spendDays = 0;
        String command = "";
        double moneyFlow = 0;
        int days = 0;

        while (cash < needMoney){

            command = scanner.nextLine();
            if (!command.equals("spend")){
                spendDays = 0;
            }
            moneyFlow = Double.parseDouble(scanner.nextLine());
            days +=1;

            if (command.equals("spend")){
                cash -=moneyFlow;
                spendDays +=1;
                if (cash <=0){
                    cash = 0;
                }
                if (spendDays == 5){
                    System.out.println("You can't save the money.");

                    System.out.printf("%d", days);
                    return;
                }
            }
            else if (command.equals("save")){
                cash += moneyFlow;
            }

        }
        System.out.printf("You saved the money for %d days.", days);
    }
}
