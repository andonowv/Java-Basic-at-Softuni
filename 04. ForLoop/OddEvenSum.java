import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int num = 0;
        int even = 0;
        int odd = 0;
        int diff = 0;

        for (int i = 1; i <= count; i++){
            num = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0){
                even += num;
            }
            else {
                odd += num;
            }
        }

        if (even == odd){
            System.out.println("Yes");
            System.out.printf("Sum = %d", even);
        }
        else {
            diff = Math.abs(even - odd);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
