//variant 3
import java.util.Scanner;

public class cycles2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double b = 0;
        double d = 0;
        for (int i = 1; i <= n; i++){
            int e = 1;
            int a = i;
            int c= a*a;
            while (a != 0){
                b = a%10;
                a /= 10;
                d = c%10;
                c /= 10;
                if (d != b){
                    e = 0;
                    break;
                }

            }
            if (e == 1){
                System.out.println(i + " " + (i*i));
            }
        }
    }
}
