import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int cakeSize = l * w;
        int total = 0;
        int diff = 0;
        int peaces = 0;
        String input = scanner.nextLine();
        while (!input.equals("STOP")){
            peaces = Integer.parseInt(input);
            total += peaces;
            if (total > cakeSize){
                diff = total - cakeSize;
                System.out.printf("No more cake left! You need %d pieces more.", diff);
                return;
            }
            input = scanner.nextLine();
        }
        diff = cakeSize - total;
        System.out.printf("%d pieces are left.", diff);
    }
}
