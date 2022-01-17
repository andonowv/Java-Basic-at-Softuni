import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int i = 0; i <= num; i++){
            for (int j = 0; j <= num; j++){
                for (int y = 0; y <= num; y++){
                    if ((i + j + y) == num){
                        count +=1;

                    }
                }
            }
        }

        System.out.println(count);
    }
}
