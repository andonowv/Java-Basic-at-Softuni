import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryCount = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        String currentAssessment = "";
        double currentScore = 0;
        double sumScore = 0;
        double averageGrade = 0;
        double finalAssessment = 0;
        int counter = 0;

        while (!command.equals("Finish")){
            currentAssessment = command;
            for (int i=0; i < juryCount; i++){
                currentScore = Double.parseDouble(scanner.nextLine());
                sumScore += currentScore;

            }
            averageGrade = sumScore / juryCount;
            System.out.printf("%s - %.2f.", currentAssessment, averageGrade);
            finalAssessment += averageGrade;
            System.out.println();
            sumScore = 0;
            counter +=1;
            command = scanner.nextLine();
        }
        finalAssessment = finalAssessment / counter;

        System.out.printf("Student's final assessment is %.2f.", finalAssessment);

    }
}
