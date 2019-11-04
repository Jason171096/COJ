import java.math.BigInteger;
import java.util.Scanner;


public class problem_1297 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int casos = e.nextInt();
        BigInteger divi =new BigInteger("495");
        BigInteger zero = BigInteger.ZERO;
        for(int i=0; i<casos; i++)
        {
            BigInteger num = e.nextBigInteger();
            if(num.mod(divi) == zero)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
