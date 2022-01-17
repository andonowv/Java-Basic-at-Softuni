import java.util.Scanner;

public class LeftandRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int left = 0;
        int right = 0;
        int num = 0;
        int diff = 0;

        for (int i = 0; i < count; i++){
            num = Integer.parseInt(scanner.nextLine());
            left += num;
        }
        for (int i = 0; i < count; i++){
            num = Integer.parseInt(scanner.nextLine());
            right += num;
        }

        if (left == right){
            System.out.printf("Yes, sum = %d", left);
        }
        else {
            diff = Math.abs(right - left);
            System.out.printf("No, diff = %d", diff);
        }
    }
}
