import java.util.Scanner;

public class hometask1 {
    public static String reverse(String[] str1){
        String str2 = "";
        for (int i = str1.length-1; i >= 0; i--){
            str2 += str1[i] + " ";
        }
        return str2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str1 = scan.nextLine().split(" ");
        System.out.println(reverse(str1));
    }
}
