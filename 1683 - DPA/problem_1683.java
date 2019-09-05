import java.util.Scanner;
public class problem_1683 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int casos = e.nextInt();
        for(int i=0; i<casos; i++)
        {
            int total=0;
            int div = e.nextInt();
            for(int j=1; j<div; j++)
            {
                if(div%j==0)
                {
                    total+=j;
                }
            }
            if(total<div)
                System.out.println("Deficient");
            else if(total==div)
                System.out.println("Perfect");
            else if(total>div)
                System.out.println("Abundant");
        }
    }
}
