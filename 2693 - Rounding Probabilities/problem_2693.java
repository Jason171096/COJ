import java.text.DecimalFormat;
import java.util.Scanner;

public class problem_2693 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        double numero = e.nextDouble();
        int round = e.nextInt();
        String ceros = "";
        while(true)
        {
            if(round==0)
                break;
            else
            {
                ceros += "0";
                round--;
            }
        }
        DecimalFormat df = new DecimalFormat("0."+ceros+"");
        System.out.println(df.format(numero));
    }
}
