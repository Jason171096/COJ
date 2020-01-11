import java.util.Scanner;

public class problem_1188 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] A = new char[10];
        char[] B = new char[10];
        int suma=0;
        String v1 = in.next();
        String v2 = in.next();
        A = v1.toCharArray();
        B = v2.toCharArray();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                suma+=Character.getNumericValue(A[i])*Character.getNumericValue(B[j]);
            }
        }
        System.out.println(suma);
    }
}
