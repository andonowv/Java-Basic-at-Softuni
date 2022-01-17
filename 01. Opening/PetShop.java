import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countDogs = Integer.parseInt(scan.nextLine());
        int otherAnimals = Integer.parseInt(scan.nextLine());

        double result = countDogs * 2.50 + otherAnimals * 4;

        System.out.println(result);
    }
}
