import java.math.BigInteger;
import java.util.Scanner;

public class problem_2196 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int casos = e.nextInt();
        for(int i=0; i<casos; i++)
        {
            BigInteger cero = BigInteger.ZERO;
            BigInteger num = e.nextBigInteger();
            BigInteger dos = new BigInteger("2");
            BigInteger resultado = num.mod(dos);
            if(resultado == cero)
                System.out.println("even");
            else
                System.out.println("odd");
        }
    }
}
