import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;
        double evenSum = 0;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;
        double num = 0;

        for (int i = 1; i <= count; i++){
            num = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0){
                evenSum += num;
                if (num > evenMax){
                    evenMax = num;
                }
                if (num < evenMin){
                    evenMin = num;
                }
            } else {
                oddSum += num;
                if (num > oddMax){
                    oddMax = num;
                } if (num < oddMin){
                    oddMin = num;
                }
            }
        }

        System.out.printf("OddSum=%.2f,", oddSum);
        System.out.println();
        if (oddMin == Integer.MAX_VALUE){
            System.out.println("OddMin=No,");
        }
        else {
            System.out.printf("OddMin=%.2f,", oddMin);
            System.out.println();
        }
        if (oddMax == Integer.MIN_VALUE){
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,", oddMax);
            System.out.println();
        }

        System.out.printf("EvenSum=%.2f,", evenSum);
        System.out.println();
        if (evenMin == Integer.MAX_VALUE){
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,", evenMin);
            System.out.println();
        }
        if (evenMax == Integer.MIN_VALUE){
            System.out.println("EvenMax=No");
        }else {
            System.out.printf("EvenMax=%.2f", evenMax);
        }

    }
}
