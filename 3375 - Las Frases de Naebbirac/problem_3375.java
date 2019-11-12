import java.util.Scanner;

public class problem_3375 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int casos = e.nextInt();
        for(int i = 0; i<casos; i++)
        {
            String cadena0 = e.next();
            String cadena1 = e.next();
            int contador = 0;
            for(int j=0; j<cadena0.length(); j++)
            {
                if(cadena0.charAt(j) == cadena1.charAt(j))
                {}
                else
                    contador++;
            }
            System.out.println(contador);
        }
    }
}
