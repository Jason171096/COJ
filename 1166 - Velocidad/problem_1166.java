import java.util.Scanner;
public class problem_1166 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int casos = e.nextInt();
        for(int i=0; i<casos; i++)
        {
            int even=0, odd=0;
            int numtotal = e.nextInt();
            int[] numeros= new int[numtotal];
            for(int j=0; j<numtotal; j++)
            {
                numeros[j] = e.nextInt();
                if(numeros[j]%2==0)
                    even++;
                else
                    odd++;
            }
            System.out.println(even +" even and "+ odd +" odd.");
        }
    }
}
