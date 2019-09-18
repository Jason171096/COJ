import java.math.BigInteger;
import java.util.Scanner;

public class problem_1059 {
    public static void main(String[] args) {
        Scanner e =  new Scanner(System.in);
        BigInteger zero = BigInteger.ZERO;
        int compare;
        do
        {
          BigInteger num =e.nextBigInteger();
          compare = num.compareTo(zero);
          String str = num.toString(2);
          if(str == "0")
              break;
          int contador = 0;
          for(int i=0; i<str.length(); i++)
          {
              if(str.charAt(i) == '1')
                  contador++;
          }
            System.out.println("The parity of "+ str +" is "+ contador +" (mod 2).");
        }while(compare != 0);
    }
}
