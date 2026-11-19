import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.next();

        boolean good = true;

        if (password.length() < 8 || password.length() > 12) {
            System.out.println("Длина должна быть от 8 до 12 символов");
            good = false;
        }

        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Нет заглавной латинской буквы");
            good = false;
        }

        if (!password.matches(".*[a-z].*")) {
            System.out.println("Нет строчной латинской буквы");
            good = false;
        }

        if (!password.matches(".*[#@$%^&*<>].*")) {
            System.out.println("Нет специального символа");
            good = false;
        }

        if (!password.matches(".*[.,!?;:].*")) {
            System.out.println("Нет знака препинания");
            good = false;
        }

        if (good) {
            System.out.println("Пароль хороший");
        }
    }
}