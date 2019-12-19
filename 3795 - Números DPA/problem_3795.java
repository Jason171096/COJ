import java.util.Scanner;

public class problem_3795 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int t=e.nextInt();
        int suma=1;
        for (int i = 0; i < t; i++) 
        {
            int num = e.nextInt();
            for (int j = 2; j < num; j++) 
            {
                if(num%j==0)
                    suma+=j;
            }
            if(suma==num)
                System.out.println("perfect");
            else if(suma<num)
                System.out.println("deficient");
            else if(suma>num)
                System.out.println("abundant");
            suma=1;
        }
    }
}
