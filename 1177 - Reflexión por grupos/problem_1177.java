import java.util.Scanner;

public class problem_1177 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        while((num = in.nextInt()) != 0)
        {
            String G = in.next();            
            String now = "";
            int multi = G.length()/num;
            int mul = G.length()/num;
            for(int i=0; i<G.length(); i+=multi)
            {
                StringBuilder sb = new StringBuilder();
                sb.append(G.substring(i, mul));
                now += sb.reverse().toString();
                mul+=multi;
            }
            System.out.println(now);
        }
    }
}
