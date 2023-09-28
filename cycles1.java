//variant 1
import java.util.Scanner;

public class cycles1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double x_end = scan.nextDouble();
        double step = scan.nextDouble();
        double y;
        System.out.println("Значение аргумента    Значение функции");
        while (x < x_end) {
            if (x >= -9 && x < -6){
                y = -(Math.pow(-(x*x)-12*x-27, 0.5));
            } else if (x >= -6 && x <= -3){
                y = x + 3;
            } else if (x > -3 && x <= 0){
                y = Math.pow(-(x*x)+9, 0.5);
            } else if (x > 0 && x <= 3){
                y = -x + 3;
            } else {
                y = 0.5*(x - 3);
            }
            System.out.println(x + "                     " + y);
            x += step;
        }
    }
}
