import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        min += 15;

        if (min > 59){
            hour +=1;
            min -= 60;
            if (hour == 24)
                hour = 00;
            if (min < 10)
                System.out.printf(hour + ":" + "0" + min);
            else
                System.out.printf(hour + ":" + min);
        }
        else
            System.out.printf(hour + ":" + min);



    }
}
