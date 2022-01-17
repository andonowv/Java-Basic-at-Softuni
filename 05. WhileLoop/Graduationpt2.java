import java.util.Scanner;

public class Graduationpt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double score = 0;
        double sumScore = 0;

        for (int i = 1; i <= 12; i++){
            score = Double.parseDouble(scanner.nextLine());
            sumScore += score;
            if (score < 4){
                score = Double.parseDouble(scanner.nextLine());
                if (score < 4){
                    System.out.printf("%s has been excluded at %d grade", name, i);
                    return;
                }
            }

        }
        sumScore = sumScore / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, sumScore);
    }
}
