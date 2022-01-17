import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double laundry = Double.parseDouble(scanner.nextLine());
        double toyPr = Double.parseDouble(scanner.nextLine());
        int toyCount = 0;
        double birthMoney = 0;
        double diff = 0;

        for (int i = 1; i <= age; i++){
            if (i % 2 == 1){
                toyCount += toyPr;
            }
            else {
                birthMoney += i * 10 / 2 - 1;
            }
        }

        double sumMoney = toyCount + birthMoney;

        if (sumMoney >= laundry){
            diff = Math.abs(sumMoney - laundry);
            System.out.printf("Yes! %.2f", diff);
        }
        else {
            diff = Math.abs(laundry - sumMoney);
            System.out.printf("No! %.2f", diff);
        }
    }
}
