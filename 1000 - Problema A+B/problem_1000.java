import java.util.Scanner;

public class problem_1000 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String a;
        int c;
        a = e.nextLine();
        String[] b = a.split(" ");
        c = Integer.parseInt(b[0]) + Integer.parseInt(b[1]);
        System.out.println(c);
        
    }
 
}
