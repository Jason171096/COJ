import java.util.Scanner;

public class problem_1484 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        float aux=0;
        int position =0;
        int N = e.nextInt();
        float[] M = new float[N];
        for (int i = 0; i < N; i++) {
            M[i] = e.nextFloat();
        }
        for (int i = 0; i < N; i++) {
            if(M[i]>=aux)
            {
                aux = M[i];
                position = i+1;
            }
        }
        System.out.println(position);
    }
}
