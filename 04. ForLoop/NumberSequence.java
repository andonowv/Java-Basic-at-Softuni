import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int num = 0;

        for (int i = 0; i < count; i++){
            num = Integer.parseInt(scanner.nextLine());

            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
        }

        System.out.printf("Max number: %d", max);
        System.out.println();
        System.out.printf("Min number: %d", min);
    }
}
