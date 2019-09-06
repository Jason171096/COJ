import java.util.Scanner;
public class problem_1933 {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int L, R;
        while(((R=e.nextInt())!=0) && ((L=e.nextInt())!=0))
        {
            int total = R+L;
            System.out.println(total);
        }
    }     
}
