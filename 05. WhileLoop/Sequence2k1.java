import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int output = 1;

        while (output <= num){
            System.out.println(output);
            output = output * 2 + 1;
        }

    }
}
