import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = text.split(" ");
        StringBuffer res = new StringBuffer(text.length());
        for (int i = 0; i < words.length; ++i){
            StringBuffer sb= new StringBuffer(words[i]);

            String s = sb.reverse().toString();
            res.append(s);

            if (i < words.length - 1){
                res.append(" ");
            }
        }
        System.out.println("Расшифрованный текст: " + res.toString());
    }
}
