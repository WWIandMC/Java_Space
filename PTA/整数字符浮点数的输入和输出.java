import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        double f1;
        f1 = in.nextDouble();
        int i;
        i = in.nextInt();
        char ch;
        ch = in.next().charAt(0);
        double f2;
        f2 = in.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print(ch + " " + i + " " + df.format(f1) + " " + df.format(f2));
    }
}