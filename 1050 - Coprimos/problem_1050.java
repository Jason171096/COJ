import java.util.Scanner;

public class problem_1050 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int con=0;
        for(int i=1; i<N; i++)
        {
            if(obtener_mcd(i, N)==1)
                con++;
        }
        System.out.println(con);
    }  
    static int obtener_mcd(int a, int b) {
       if(b==0)
           return a;
       else
           return obtener_mcd(b, a % b);
   }
}
