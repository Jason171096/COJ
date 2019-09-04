import java.util.Arrays;
import java.util.Scanner;


public class problem_1099 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        boolean bandera=true;
        String num;
        String [] arreglo = new String[3];
        int [] arregloint = new int[3];
        int num1, num2, num3;
        while(bandera == true)
        {
            num = e.nextLine();
            if(num.charAt(0)=='0')
            {
                bandera=false;
                break;
            }
            else
            {
                arreglo = num.split(" ");
                for(int i = 0; i<3; i++)
                {
                    arregloint[i] = Integer.parseInt(arreglo[i]);
                }
                Arrays.sort(arregloint);
                num1 = arregloint[0]*arregloint[0];
                num2 = arregloint[1]*arregloint[1];
                num3 = arregloint[2]*arregloint[2];
                if(num3 == (num1+num2))
                    System.out.println("right");
                else
                    System.out.println("wrong");
            }
        } 
    }
}
