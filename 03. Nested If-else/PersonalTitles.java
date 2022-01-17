import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String person = scanner.nextLine();

        if (person.equals("m")){
            if (age < 16){
                System.out.println("Master");
            }
            else {
                System.out.println("Mr.");
            }

        }
        else if (person.equals("f")){
            if (age < 16){
                System.out.println("Miss");
            }
            else {
                System.out.println("Ms.");
            }
        }
    }
}
