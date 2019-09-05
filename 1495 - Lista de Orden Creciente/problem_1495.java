import java.util.Arrays;
import java.util.Scanner;


public class problem_1495 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int n= e.nextInt();
        int[] lista = new int[n];
        for(int i=0; i<lista.length; i++)
        {
            lista[i] = e.nextInt();
        }
        Arrays.sort(lista);
        for(int var:lista)
        {
            System.out.println(var);
        }
    }
}
