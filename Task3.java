import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = text.split("[ ,.!?;:]+");
        int cnt = 0;
        for (int i = 0; i < words.length; ++i){
            if (words[i].length() == 3){
                ++cnt;
            }
        }
        System.out.println("Количество трёхбуквенных слов: " + cnt);

    }
}
