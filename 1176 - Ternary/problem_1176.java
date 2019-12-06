import java.util.Scanner;

public class problem_1176 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        long num;
        while((num = e.nextInt())>=0)
        {
            System.out.println(Base3(num));
        }
    }
    public static long Base3(long num) {
        long ret = 0, factor = 1;
        while (num > 0) {
            ret += num % 3 * factor;
            num /= 3;
            factor *= 10;
        }
        return ret;
    }
}
