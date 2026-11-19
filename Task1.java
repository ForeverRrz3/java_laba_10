import java.util.Scanner;
import java.lang.StringBuffer;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s.length());
        for (int i = 0; i < s.length(); ++i){
            if (!Character.isUpperCase(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        System.out.println("Слово без заглавных букв: " + sb.toString());
    }
}