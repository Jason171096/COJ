import java.util.Scanner;

public class problem_1684 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String[] roman = {"I","IV","V","IX", "X", "XL", "L", 
            "XC", "C","CD", "D", "CM", "M"};
        int[] value = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int N = e.nextInt();
        String romano = "";
        for (int i = 0; i < N; i++) {
            String binary = e.next();
            int decimal = Integer.parseInt(binary, 2);
            for (int j = 12; j >= 0;) 
            {
                if(decimal>=value[j])
                {
                    decimal = decimal-value[j];
                    romano += roman[j];
                }
                else
                    j--;
            }
            System.out.println(romano);
            romano="";
        }    
    }
}
