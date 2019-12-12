import java.math.BigInteger;
import java.util.Scanner;

public class problem_1293 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int N = e.nextInt();
        BigInteger two = new BigInteger("2");
        System.out.println(two.pow(N));
    }
}
