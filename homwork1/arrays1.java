//variant 3
import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] arr = new double[n];
        double min = 0;
        int index = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
            if (arr[i] > 0){
                index = i;
            }
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Максимальный отрицательный элемент массива: "+min);
        for (int i = 0; i < index; i++){
            sum += arr[i];
        }
        System.out.println("Сумму элементов массива, расположенных до последнего положительного элемента массива: " +sum);
        System.out.print("Массив { ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");
    }
}
