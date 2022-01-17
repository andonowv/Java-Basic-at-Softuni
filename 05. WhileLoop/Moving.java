import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int volume = w * l * h;
        int boxes = 0;
        int sumBox = 0;
        int diff = 0;

        String input = scanner.nextLine();

        while (!input.equals("Done")){
            boxes = Integer.parseInt(input);
            sumBox += boxes;
            if (sumBox > volume){
                diff = sumBox - volume;
                System.out.printf("No more free space! You need %d Cubic meters more.", diff);
                return;
            }

            input = scanner.nextLine();
        }
        diff = volume - sumBox;
        System.out.printf("%d Cubic meters left.", diff);
    }
}
