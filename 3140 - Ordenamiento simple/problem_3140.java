import java.util.Arrays;
import java.util.Scanner;

public class problem_3140 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int canti = e.nextInt();
        int[] arreglo = new int[canti];
        for(int i=0; i<arreglo.length; i++)
        {
            arreglo[i] = e.nextInt();
        }
        Arrays.sort(arreglo);
        for(int var : arreglo)
        {
            System.out.println(var);
        }
    }
}
