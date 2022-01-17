import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double max = Integer.MIN_VALUE;
        double num = 0;
        double diff = 0;

        for (int i = 0; i < count; i++){
            num = Double.parseDouble(scanner.nextLine());
            if (num > max){
                max = num;
            }
            sum += num;

        }
        if (sum / 2 == max){
            System.out.println("Yes");
            System.out.printf("Sum = %.0f", max);
        }
        else {
            diff = Math. abs(max - (sum - max));
            System.out.println("No");
            System.out.printf("Diff = %.0f", diff);
        }
    }
}
