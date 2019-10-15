import java.util.Arrays;
import java.util.Scanner;
 public class problem_1485 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        char[] charArray = userInput.toCharArray();
        Arrays.sort(charArray);
        System.out.println(String.valueOf(charArray));
    }
}
