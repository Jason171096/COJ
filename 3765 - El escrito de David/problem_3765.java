import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_3765 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena = br.readLine();
        int total=0;
        for(int i=0; i<cadena.length(); i++)
        {
            int ascii = (int)cadena.charAt(i);
            if(ascii==97 || 
                    ascii==101 || 
                    ascii==105 || 
                    ascii==111 || 
                    ascii==117)
                ascii = 0;
            else
                total += (ascii-96);
        }
        System.out.println(total);
    }
}
