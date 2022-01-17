import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int TARGET = 10000;
        int total = 0;
        int walked = 0;
        int diff = 0;
        String input = scanner.nextLine();

        while (!input.equals("Going home")){
            walked = Integer.parseInt(input);
            total += walked;
            if (total >= TARGET){
                diff = total - TARGET;
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", diff);
                return;
            }
            input = scanner.nextLine();
        }
        walked = Integer.parseInt(scanner.nextLine());
        total +=walked;
        if (total >= 10000){
            diff = total - TARGET;
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        }
        else {
            diff = TARGET - total;
            System.out.printf("%d more steps to reach goal.", diff);
        }

    }
}
