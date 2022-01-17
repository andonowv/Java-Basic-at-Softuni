import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int primeNum = 0;
        int nonPrime =0;
        int counter = 0;

        while (!command.equals("stop")){
            int num = Integer.parseInt(command);
            if (num < 0){
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i < num; i++){
                if (num % i == 0){
                    isPrime = false;
                    break;
                }

            }
            if (isPrime){
                primeNum += num;
            }else {
                nonPrime += num;
            }
            command = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d", primeNum);
        System.out.println();
        System.out.printf("Sum of all non prime numbers is: %d", nonPrime);
    }
}
