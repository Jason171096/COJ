import java.util.Scanner;

public class problem_1070 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String valor = scan.nextLine();
            int entero = Integer.parseInt(valor);
            int cua=0, rec=0, aux=0;
            for(int i=0; i<=entero; i++)
            {   
                aux += i;
                rec = aux*aux;
                cua+=Math.pow(i, 2);
            }
            System.out.println(cua + " " + rec);
        }
    }
}
