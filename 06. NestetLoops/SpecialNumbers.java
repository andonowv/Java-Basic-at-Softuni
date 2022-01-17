import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int a= 1; a <=9; a++){
            for (int b = 1; b <=9; b++){
                for (int c = 1; c <=9; c++){
                    for (int d = 1; d <=9; d++){
                        if (num%a==0 && num%b==0 && num%c==0 && num%d==0){
                            System.out.printf("%d%d%d%d ", a,b,c,d);
                        }
                    }
                }
            }
        }
    }
}
