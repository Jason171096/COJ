import java.util.Scanner;

public class problem_1839 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int casos = e.nextInt();
        for(int i=0; i<casos; i++)
        {
            int N = e.nextInt();
            for(int j=0; j<3; j++)
            {
                N = (2)*(N+3);
            }
            System.out.println(N);
        }
    }
}
