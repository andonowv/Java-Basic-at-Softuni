import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sec1 = Integer.parseInt(scanner.nextLine());
        int sec2 = Integer.parseInt(scanner.nextLine());
        int sec3 = Integer.parseInt(scanner.nextLine());

        int sum = sec1 + sec2 + sec3;

        int min = sum / 60;
        int sumSec = sum % 60;

        if (sumSec < 10){
            System.out.printf(min + ":" + "0" + sumSec);
        }
        else {
            System.out.printf(min +":" + sumSec);
        }

    }
}
