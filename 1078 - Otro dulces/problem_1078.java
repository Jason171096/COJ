import java.util.Scanner;

public class problem_1078 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int T = e.nextInt();
        while(true)
        {
            if(T==0)
                break;
            int num = e.nextInt();
            int sum = 0;
            
            for(int i = 0; i<num; i++)
            {
                sum += e.nextInt();
            }
            if(sum%num==0)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
