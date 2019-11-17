import java.util.Scanner;

public class problem_3137 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int casos = e.nextInt();
        for (int i = 0; i < casos; i++) {
            int A, B, C;
            A = e.nextInt();
            B = e.nextInt();
            C = e.nextInt();
            try {
                if (A + B == C || A - B == C || A * B == C || A / B == C || A % B == C) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } catch (Exception E) {
                System.out.println("NO");
            }
        }
    }
}
