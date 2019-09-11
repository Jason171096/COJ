import java.math.BigInteger;
import java.util.Scanner;

public class problem_1102 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        BigInteger cero = BigInteger.ZERO;
        BigInteger dos = new BigInteger("11");
        BigInteger num;
        do
        {
            num = e.nextBigInteger();
            if(num.equals(cero))
                break;
            else if(num.mod(dos) == cero)
                System.out.println(num + " is a multiple of 11.");
            else
                System.out.println(num + " is not a multiple of 11.");
        }while(num != cero);
    }
}
