import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double cash = 0;

        while (!input.equals("End")){

            while (cash < neededMoney){
                cash += Double.parseDouble(scanner.nextLine());
            }
            System.out.printf("Going to %s!", input);
            System.out.println();
            cash =0;
            input = scanner.nextLine();
            if (input.equals("End")){
                break;
            }
            neededMoney = Double.parseDouble(scanner.nextLine());
        }
    }
}
