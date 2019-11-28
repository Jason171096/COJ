import java.util.Scanner;

public class problem_2205 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int casos = e.nextInt();
        for(int i=0; i<casos; i++)
        {
            int A, B;
            A = e.nextInt();
            B = e.nextInt();
            int contador=0;
            for(int j=A; j<=B; j++)
            {
                String binario = Integer.toBinaryString(j);
                for(int k = 0; k<binario.length(); k++)
                {
                    if(binario.charAt(k) == '1')
                        contador++;
                }
            }
            System.out.println(contador);
        }
    }
}
