import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int flores = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());


        for (int floor = flores ; floor > 0; floor--){
            for (int room = 0; room < rooms; room++){
                if (floor == flores){
                    System.out.printf("L%d%d ", flores, room);
                }
                else if (floor % 2 == 0){
                    System.out.printf("O%d%d ",floor,room);
                }else {
                    System.out.printf("A%d%d ",floor,room);
                }
            }
            System.out.println();
        }
    }
}
