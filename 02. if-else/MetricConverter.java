import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        String frtUnit = scanner.nextLine();
        String scdUnit = scanner.nextLine();
        double result =0;
        // mm, cm, m

        if (frtUnit.equals("mm")){
            if (scdUnit.equals("cm")){
                result = num * 0.1;
            }
            else if (scdUnit.equals("m")){
                result = num * 0.001;
            }
        }
        else if (frtUnit.equals("cm")){
            if (scdUnit.equals("mm")){
                result = num * 10;
            }
            else if (scdUnit.equals("m")){
                result = num * 0.01;
            }
        }
        else if (frtUnit.equals("m")){
            if (scdUnit.equals("mm")){
                result = num * 1000;
            }
            else if (scdUnit.equals("cm")){
                result = num * 100;
            }
        }

        System.out.printf("%.3f", result);
    }
}
