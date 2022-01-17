import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        double trans = 0;
        double tickPr = 0;
        double diff = 0;
        if (count >=1 && count <=4)
            trans = budget * 0.75;
        else if (count >= 5 && count <= 9)
            trans = budget * 0.60;
        else if (count >= 10 && count <=24)
            trans = budget * 0.50;
        else if (count >= 25 && count <= 49)
            trans = budget * 0.40;
        else if (count >= 50)
            trans = budget * 0.25;

        if (type.equals("VIP"))
            tickPr = 499.99;
        else if (type.equals("Normal"))
            tickPr = 249.99;

        double neededMoney = tickPr + trans;

        if (neededMoney >= budget)
            diff = trans - tickPr;
        System.out.printf("Yes! You have %.2f leva left.", diff);
    }
}
