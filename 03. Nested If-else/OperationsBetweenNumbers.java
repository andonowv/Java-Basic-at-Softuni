import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secNum = Double.parseDouble(scanner.nextLine());
        String oper = scanner.nextLine();
        double res = 0;
        String type = "";

        if (oper.equals("+")){
            res = firstNum + secNum;
        }
        else if (oper.equals("-")){
            res = firstNum - secNum;
        }
        else if (oper.equals("*")){
            res = firstNum * secNum;
        }
        if (res % 2 == 0){
            type = "even";
        }
        else {
            type = "odd";
        }

        if (oper.equals("+") || oper.equals("-") || oper.equals("*")){
            System.out.printf("%.0f %s %.0f = %.0f - %s", firstNum, oper, secNum, res, type);
        }

        if (oper.equals("/")){
            res = firstNum / secNum;
            if (secNum == 0){
                System.out.printf("Cannot divide %.0f by zero", firstNum);
            }
            else {
                System.out.printf("%.0f / %.0f = %.2f", firstNum, secNum, res);
            }
        }
        else if (oper.equals("%")){
            if (secNum == 0) {
                System.out.printf("Cannot divide %.0f by zero", firstNum);
            }
            else {
                res = firstNum % secNum;
                System.out.printf("%.0f %s %.0f = %.0f", firstNum,oper, secNum, res);
            }

        }
    }
}
