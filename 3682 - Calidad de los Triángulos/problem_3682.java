import java.util.Scanner;

public class problem_3682 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int casos = e.nextInt();
        for (int i = 0; i < casos; i++) {
            long a, b, c;
            double TQ;
            a = e.nextLong();
            b = e.nextLong();
            c = e.nextLong();
            TQ = (double)((b + c - a) * (a + b - c) * (c + a - b)) / (a * b * c);
            if (TQ == 1) {
                System.out.println("equilateral");
            } else if (TQ > 0.5 && TQ < 1) {
                System.out.println("good");
            } else if(TQ <=0.5){
                System.out.println("bad");
            }
        }
    }
}
