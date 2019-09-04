import java.text.DecimalFormat;
import java.util.Scanner;


public class problem_1023 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
         
        DecimalFormat df = new DecimalFormat("#.00");
        double[] mes = new double[12];
        double total=0;
        for(int i=0; i<12; i++)
        {
            mes[i] = e.nextDouble();
        }
        for(double suma:mes)
        {
            total+=suma;
        }
        
        System.out.println("$"+df.format(total/12));
    }
}
