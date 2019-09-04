import java.util.Scanner;


public class problem_1805 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String cad;
        long A,B, res;
        String[] a = new String[2];
        cad = e.nextLine();
        a = cad.split(" ");
        A = Integer.parseInt(a[0]);
        B = Integer.parseInt(a[1]);
        res = 2*(A+B);
        System.out.println(res);
    }
}
