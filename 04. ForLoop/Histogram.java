import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int num = 0;
        double frstGr = 0;
        double scndGr = 0;
        double thrdGr = 0;
        double frthGr = 0;
        double fthGr = 0;

        for (int i = 0; i < count; i++){
            num = Integer.parseInt(scanner.nextLine());
            if (num < 200){
                frstGr += 1;
            } else if (num >=200 && num < 400){
                scndGr +=1;
            }else if (num >=400 && num < 600){
                thrdGr +=1;
            }else if (num >=600 && num < 800){
                frthGr +=1;
            }else if (num >=800){
                fthGr += 1;
            }
        }

        frstGr = frstGr / count * 100;
        scndGr = scndGr / count * 100;
        thrdGr = thrdGr / count * 100;
        frthGr = frthGr / count * 100;
        fthGr = fthGr / count * 100;

        System.out.printf("%.2f%%", frstGr);
        System.out.println();
        System.out.printf("%.2f%%", scndGr);
        System.out.println();
        System.out.printf("%.2f%%", thrdGr);
        System.out.println();
        System.out.printf("%.2f%%", frthGr);
        System.out.println();
        System.out.printf("%.2f%%", fthGr);


    }
}
