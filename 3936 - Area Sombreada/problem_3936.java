import java.util.Scanner;

public class problem_3936 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int A = e.nextInt();
        int AreaRec = (5*(2*A))/2;
        int AreaCua = A*(2*A);        
        System.out.println(AreaRec + AreaCua);
    }
}
