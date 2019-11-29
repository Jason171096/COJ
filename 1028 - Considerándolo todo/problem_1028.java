import java.util.Scanner;

public class problem_1028 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        
        while(e.hasNext())
        {
            String cadena = e.nextLine();
            String[] str = cadena.split(" ");
            int m = str[0].length();
            int n = str[1].length();
            boolean res = isSubSequence(str[0], str[1], m, n);
            if (res) 
                System.out.println("Yes");
            else 
                System.out.println("No");           
        }
    }


    static boolean isSubSequence(String str1,
            String str2, int m, int n) {
        int j = 0;

        for (int i = 0; i < n && j < m; i++) {
            if (str1.charAt(j) == str2.charAt(i)) {
                j++;
            }
        }
        return (j == m);
    }
}
