import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double qua = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        switch (city){
            case "Sofia":
                if (product.equals("coffee")){
                    sum = qua * 0.50;
                }
                else if (product.equals("water")){
                    sum = qua * 0.80;
                }
                else if (product.equals("beer")){
                    sum = qua * 1.20;
                }
                else if (product.equals("sweets")){
                    sum = qua * 1.45;
                }
                else if (product.equals("peanuts")){
                    sum = qua * 1.60;
                }
                break;
            case "Plovdiv":
                if (product.equals("coffee")){
                    sum = qua * 0.40;
                }
                else if (product.equals("water")){
                    sum = qua * 0.70;
                }
                else if (product.equals("beer")){
                    sum = qua * 1.15;
                }
                else if (product.equals("sweets")){
                    sum = qua * 1.30;
                }
                else if (product.equals("peanuts")){
                    sum = qua * 1.50;
                }
                break;
            case "Varna":
                if (product.equals("coffee")){
                    sum = qua * 0.45;
                }
                else if (product.equals("water")){
                    sum = qua * 0.70;
                }
                else if (product.equals("beer")){
                    sum = qua * 1.10;
                }
                else if (product.equals("sweets")){
                    sum = qua * 1.35;
                }
                else if (product.equals("peanuts")){
                    sum = qua * 1.55;
                }
                break;

        }
        System.out.println(sum);
    }
}
