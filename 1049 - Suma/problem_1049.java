import java.util.Scanner;

public class problem_1049 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int n, total;
        n = e.nextInt();
        if(n>=0)
            System.out.println(n+(n*(n-1))/2);
        else
            System.out.println(((n*(n-1))/-2)+1);  
    }
}
