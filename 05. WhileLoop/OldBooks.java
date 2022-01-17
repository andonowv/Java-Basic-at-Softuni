import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        String input = scanner.nextLine();
        int checkedBooks = 0;
        while (!input.equals(searchedBook)){
            checkedBooks +=1;

            if (input.equals("No More Books")){
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.",checkedBooks -1);
                return;
            }
        input = scanner.nextLine();
        }
        System.out.printf("You checked %d books and found it.", checkedBooks);
    }
}
