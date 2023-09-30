//variant 3
import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 8;
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[j][i] = scan.nextDouble();
            }
        }
        for (int i = 0; i < n; i++){
            int k = 0;
            for (int j = 0; j < n; j++){
               if (matrix[j][i] == matrix[i][j]){
                   k++;
               }
            }
            if (k == n){
                System.out.println("k, при которых k-я строка матрицы совпадает с k-м столбцом: " + (i+1) + " ");
                // if there are no matches, it won't output anything
            }
        }
        System.out.println("Матрица");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix[0].length; i++) {
            double swap = matrix[i][0];
            matrix[i][0] = matrix[i][matrix.length-1];
            matrix[i][matrix.length-1] = swap;
        }
        System.out.println();
        System.out.println("Матрица, где 1 и последняя строки поменяны местами");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
