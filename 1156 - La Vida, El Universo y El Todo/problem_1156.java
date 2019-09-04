import java.util.Scanner;


public class problem_1156 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        boolean bandera = true;
        int num;
        while(bandera==true)
        {
            num= e.nextInt();
            if(num==42)
            {
                bandera= false;
                break;
            }
            else
                System.out.println(num);
        }
    }
}
