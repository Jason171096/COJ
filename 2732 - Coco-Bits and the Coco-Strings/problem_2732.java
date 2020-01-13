import java.util.Scanner;

public class problem_2732 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            String cad = in.next();
            StringBuilder sb = new StringBuilder();
            sb.append(cad);
            System.out.println(Transform(sb));
        }
    }
    static String Transform(StringBuilder s)
    {
        int log = s.length();
        for (int i = 0; i < log; i++) {
            Character c = s.charAt(i);
            if(Character.isLowerCase(c))
                s.replace(i, i+1, Character.toUpperCase(c)+"");
            else
                s.replace(i, i+1, Character.toLowerCase(c)+"");
        }
        return s.toString();
    }
}
