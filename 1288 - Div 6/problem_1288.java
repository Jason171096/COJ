import java.math.BigInteger;
import java.util.Scanner;
public class problem_1288 {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int T = e.nextInt();
        for(int i=0;i<T; i++)
        {
            BigInteger N = e.nextBigInteger();
            BigInteger seis = new BigInteger("6");
            BigInteger cero = BigInteger.ZERO;
            if(N.mod(seis)==cero)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }     
}
