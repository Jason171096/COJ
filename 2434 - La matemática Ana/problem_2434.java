import java.util.Scanner;
public class problem_2434 {
 
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int num;
        while((num = e.nextInt()) != 0)
        {
            System.out.println(primorial(num));
        }
    }
    
    public static long primorial(int n) {
        if(n == 2) {
            return 2; 
        }
        if(esPrimo(n)) {
            return n * primorial(n-1);
        }
        return primorial(n-1); 
    }
    public static boolean esPrimo(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
