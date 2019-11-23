import java.util.Scanner;

public class problem_3662 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int N;
        while ((N = e.nextInt()) != -1) {
            if (N == 6 || N == 28 || N == 496 || N == 8128) {
                String con = "";
                for (int i = 1; i < N; i++) {
                    if (N % i == 0) {
                        con += "" + i + " + ";
                    }
                }
                int tamaño = con.length();
                String sub = con.substring(0, tamaño - 3);
                System.out.println(N + " = " + sub);
            } else {
                System.out.println(N + " is NOT perfect.");
            }
        }
    }
}
