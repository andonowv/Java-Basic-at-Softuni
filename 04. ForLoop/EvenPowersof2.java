import java.util.Scanner;

public class EvenPowersof2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= num; i = i + 2){

            System.out.printf("%.0f",Math.pow(2, i));
            System.out.println();
        }
    }
}
