import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());
        String web = " ";

        for (int i = 0; i < tabs; i++){
            web = scanner.nextLine();
            if (web.equals("Facebook")){
                salary -= 150;
            }
            else if (web.equals("Instagram")){
                salary -= 100;
            }
            else if (web.equals("Reddit")){
                salary -= 50;
            }
            if (salary <=0){
                System.out.println("You have lost your salary.");
                return;
            }

        }
        System.out.printf("%.0f", salary);

    }
}
