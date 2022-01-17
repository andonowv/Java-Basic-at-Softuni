import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badScore = Integer.parseInt(scanner.nextLine());
        double countBad = 0;

        String command = scanner.nextLine();

        int count = 0;
        double average = 0;
        String lastPr = "";

        while (!command.equals("Enough")){
            double score = Double.parseDouble(scanner.nextLine());
            lastPr = command;
            count +=1;
            average += score;
            if (score <= 4){
                countBad +=1;
                if (countBad == badScore){
                    System.out.printf("You need a break, %d poor grades.", badScore);
                    return;
                }
            }
        command = scanner.nextLine();

        }
        average = average / count;
        System.out.printf("Average score: %.2f", average);
        System.out.println();
        System.out.printf("Number of problems: %d", count);
        System.out.println();
        System.out.printf("Last problem: %s", lastPr);
    }
}
