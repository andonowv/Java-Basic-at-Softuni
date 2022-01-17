import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = "s3cr3t!P@ssw0rd";

        String inputPass = scanner.nextLine();

        if (inputPass.equals(pass)){
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong password!");
        }
    }
}
