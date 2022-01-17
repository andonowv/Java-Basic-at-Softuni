import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int num = 0;
        double frstGr = 0;
        double scndGr = 0;
        double thrdGr = 0;


        for (int i = 0; i < count; i++){
            num = Integer.parseInt(scanner.nextLine());
            if (num %2 == 0){
                frstGr += 1;
            } if (num % 3 == 0){
                scndGr +=1;
            }if (num % 4 == 0){
                thrdGr +=1;
            }
        }

        frstGr = frstGr / count * 100;
        scndGr = scndGr / count * 100;
        thrdGr = thrdGr / count * 100;


        System.out.printf("%.2f%%", frstGr);
        System.out.println();
        System.out.printf("%.2f%%", scndGr);
        System.out.println();
        System.out.printf("%.2f%%", thrdGr);

    }
}
