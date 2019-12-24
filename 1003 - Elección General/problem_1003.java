import java.util.Scanner;

public class problem_1003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 0; t < T; t++) {
            int n = in.nextInt(), m = in.nextInt();
            int[][] votos = new int[1000][1000];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    votos[i][j] = in.nextInt();
                }
            }
            int sum, may=0, candidato=0;
            for (int i = 0; i < n; i++) {
                sum=0;
                for (int j = 0; j < m; j++) {
                    sum+=votos[j][i];
                }
                if(sum>may)
                {
                    may=sum;
                    candidato=i+1;
                }
            }
            System.out.println(candidato);
        }
    }
}
