import java.util.Arrays;
import java.util.Scanner;

public class problem_1441 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int[] num = new int[3];
        num[0] = e.nextInt();
        while(num[0]!=0)
        {
            num[1]=e.nextInt();
            num[2]=e.nextInt();
            Arrays.sort(num);
            if(Math.pow(num[0], 2)+Math.pow(num[1], 2)==Math.pow(num[2], 2))
                System.out.println("right");
            else
                System.out.println("wrong");
            num[0] = e.nextInt();
        }
    }
}
