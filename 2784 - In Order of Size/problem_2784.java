import java.util.Arrays;
import java.util.Scanner;

public class problem_2784 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] array = new int[N+1];
        for (int i = 1; i <= N; i++) {
            array[i] = in.nextInt();
        }
        Arrays.sort(array);
        array[0]=array[array.length-1];
        for (int i = 0; i < N-1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[array.length-2]);
    }
}
