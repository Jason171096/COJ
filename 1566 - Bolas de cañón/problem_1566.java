import java.util.Scanner;

public class problem_1566 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int C;
        while((C = in.nextInt())!=0)
        {
            int P = C;
            System.out.println(Recursivo(P));
        }
    }
    static int Recursivo(int num)
    {
        if(num != 1)
            return (num*num) + Recursivo(num-1);
        else
            return 1;
    }
}
