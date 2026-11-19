import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = text.replace(",", " , ").split("\\s+");
        StringBuilder result = new StringBuilder();
        int cost = 0;
        for (String word : words) {
            if (word.equals(",")) {
                result.append("зпт ");
                cost += 10;
            } else if (word.length() > 2) {
                result.append(word).append(" ");
                cost += 10;
            }
        }
        System.out.println("cтоимость: " + cost);
        System.out.println("Текст телеграммы: " + result.toString());
    }
}