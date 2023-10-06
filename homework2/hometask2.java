import java.util.Scanner;
// important note: if you want punctuation marks not to be taken into account when encoding, put a space between them and the words
public class hometask2 {
    public static void encoder(String str1) {
        String[] words = str1.split(" ");
        String last_str = "";
        for (String word : words){
            if (word.length() > last_str.length()){
                last_str = word;
            }
        }
        int K = last_str.length();
        System.out.println("K = "+K);
        char[] chars = str1.toCharArray();
        for(int i = 0; i < str1.length(); i++){
            boolean Big = (chars[i]+"").equals((chars[i]+"").toUpperCase());
            boolean Small = (chars[i]+"").equals((chars[i]+"").toLowerCase());
            if (chars[i] == '.'){
                continue;
            } else if (chars[i] == ','){
                continue;
            } else if (chars[i] == ' '){
                continue;
            } else if (Small){
                if (((int) chars[i] + K) < 123){
                    chars[i] = (char)((int) chars[i] + K);
                } else {
                    chars[i] = (char)(((int) chars[i] + K)%122 + 96);
                }
            } else if (Big){
                if (((int) chars[i] + K) < 91){
                    chars[i] = (char)((int) chars[i] + K);
                } else {
                    chars[i] = (char)(((int) chars[i] + K)%90 + 64);
                }
            }
        }
        String ans = new String(chars);
        System.out.println("Зашифрованная строка: " + ans);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        encoder(str1);
    }
}
