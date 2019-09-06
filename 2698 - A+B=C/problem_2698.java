import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class problem_2698 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena = br.readLine();
        int suma = 0;
        for(int i=0; i<cadena.length(); i++)
        {
            suma += (cadena.charAt(i)-64);
        }
        System.out.println(suma);
    }
}
