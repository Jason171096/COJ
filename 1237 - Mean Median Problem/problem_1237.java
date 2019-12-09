import java.util.Scanner;

public class problem_1237 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int A, B, C;
        while ((B = e.nextInt()) != 0 && (A = e.nextInt()) != 0) 
        {
            C = (B * 3) - B - A;
            System.out.println(C);
        }
    }
}
