import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int projects = Integer.parseInt(scan.nextLine());

        int result = projects * 3;

        System.out.println("The architect " + name +" will need " + result +" hours to complete " + projects +" project/s.");
    }
}
