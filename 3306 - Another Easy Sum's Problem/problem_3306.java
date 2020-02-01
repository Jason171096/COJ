import java.util.Scanner;


public class problem_3306 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String A = e.next();
        String B = e.next();
        int iA = Integer.parseInt(A, 8);
        int iB = Integer.parseInt(B, 8);
        String Octal = Integer.toOctalString(iA+iB);
        int O = Integer.parseInt(Octal, 8);
        System.out.println("0x"+Integer.toHexString(O));
    }
}
