import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double resto = Double.parseDouble(scanner.nextLine());
        int coins = (int)(resto * 100);
        int count = 0;
        int balance = coins;

        while (balance !=0){
            if (balance >= 200){
                balance -= 200;
                count +=1;
            }
            else if (balance >= 100){
                balance -=100;
                count +=1;
            }
            else if (balance >=50){
                balance -= 50;
                count +=1;
            }
            else if (balance >=20){
                balance -= 20;
                count +=1;
            }
            else if (balance >=10){
                balance -= 10;
                count +=1;
            }
            else if (balance >= 5){
                balance -=5;
                count +=1;
            }
            else if (balance >=2){
                balance -=2;
                count +=1;
            }
            else if (balance >=1){
                balance -=1;
                count +=1;
            }
        }
        System.out.println(count);

;    }
}
