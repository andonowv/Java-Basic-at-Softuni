import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double result = 0;

        if (sales < 0){
            System.out.println("error");
            return;
        }

        if (city.equals("Sofia")){
            if (sales >= 0 && sales <=500){
                result = sales * 0.05;
            }
            else if (sales > 500 && sales <=1000){
                result = sales * 0.07;
            }
            else if (sales > 1000 & sales <= 10000){
                result = sales * 0.08;
            }
            else if (sales > 10000){
                result = sales * 0.12;
            }
            System.out.printf("%.2f",result);
        }
        else if (city.equals("Varna")){
            if (sales >= 0 && sales <=500){
                result = sales * 0.045;
            }
            else if (sales > 500 && sales <=1000){
                result = sales * 0.075;
            }
            else if (sales > 1000 & sales <= 10000){
                result = sales * 0.10;
            }
            else if (sales > 10000){
                result = sales * 0.13;
            }
            System.out.printf("%.2f",result);
        }
        else if (city.equals("Plovdiv")){
            if (sales >= 0 && sales <=500){
                result = sales * 0.055;
            }
            else if (sales > 500 && sales <=1000){
                result = sales * 0.08;
            }
            else if (sales > 1000 & sales <= 10000){
                result = sales * 0.12;
            }
            else if (sales > 10000){
                result = sales * 0.145;
            }
            System.out.printf("%.2f",result);
        }
        else{
            System.out.println("error");
        }


    }
}
