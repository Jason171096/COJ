import java.math.BigInteger;
import java.util.Scanner;


public class problem_1306 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int caso = e.nextInt();
        if(caso>=1)
        {
            BigInteger[] A = new BigInteger[caso];
            BigInteger num;
            for(int i=0;i<A.length;i++)
            {
                num = e.nextBigInteger();
                A[i] = num;
            }
            for(int j=0;j<A.length;j++)
            {
                if(A[j].mod(new BigInteger("4")).equals(BigInteger.ZERO))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
