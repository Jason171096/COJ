import java.util.Scanner;


public class problem_1312 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String[] separador = new String[2];
        int R1, res, R2;
        String num = e.nextLine();
        separador = num.split(" ");
        R1 = Integer.parseInt(separador[0]);
        res = Integer.parseInt(separador[1]);
        R2 = (res*2)-R1;
        System.out.println(R2);
    }
}
