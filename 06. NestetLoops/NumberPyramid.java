import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );

        int n = Integer.parseInt( scanner.nextLine());
        int count = 0;

        for ( int i = 1; i <= n; i++) {

            for ( int j = 1; j <= i; j++ ) {
                count++;
                System.out.printf("%d ", count);
                if (count == n ) return;
            }
            System.out.println();
        }

    }

}