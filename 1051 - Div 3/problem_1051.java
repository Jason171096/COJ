import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int res=0;
        if(N==1){
            System.out.println(res);
        }
        else if ((N + 1) % 3 == 0) {
            res = (((N + 1) / 3) << 1) - 1;
            System.out.println(res);
        } else {
            if ((N % 3) == 0) {
                res = (N / 3) << 1;
                System.out.println(res);
            } else {
                res = ((N - 1) / 3) << 1;
                System.out.println(res);
            }
        }
    }
}
