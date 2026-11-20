import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer text = new StringBuffer();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            text.append(line).append(" ");
        }

        System.out.print("Введите ключевое слово: ");
        String keyWord = sc.nextLine();
        String[] sentences = text.toString().split("[.!?]");

        for (String sentence: sentences){
            if (sentence.matches("(^|.*\\s)" + keyWord + "(\\s.*|$)")){
                System.out.println(sentence);
            }
        }
    }
}
