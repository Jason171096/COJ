import java.util.Scanner;

public class problem_3319 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int T = e.nextInt();
        long aux = 1;
        for (int i = 0; i < T; i++) {
            int N = e.nextInt();
            for (long j = 2; j <= N; j++) {
                if(esPrimo(j))
                    aux*=j;
            }
            System.out.println(aux);
            aux=1;
        }
    }

    public static boolean esPrimo(long numero) {
        long contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;
    }
}
