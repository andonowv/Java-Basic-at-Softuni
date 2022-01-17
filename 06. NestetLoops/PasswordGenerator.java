import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secNum = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i < firstNum; i++){
            for (int j = 1; j < firstNum; j++){
                for (int k = 97; k < 97 + secNum; k++){
                    for (int f = 97; f < 97 + secNum; f++){
                        for (int z = 1; z <= firstNum; z++){
                            if (z > j && z > i){
                                System.out.printf("%d%d%s%s%d ", i, j, (char)k, (char)f, z);
                            }

                        }
                    }
                }
            }
        }
    }
}
