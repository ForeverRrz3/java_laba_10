import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] nums = text.split("\\D+");

        int s = 0;
        for (int i = 0; i < nums.length; ++i){
            if (nums[i].isEmpty()){
                continue;
            }
            s += Integer.parseInt(nums[i]);
        }
        System.out.println("Сумма чисел: "+s);
    }
}
