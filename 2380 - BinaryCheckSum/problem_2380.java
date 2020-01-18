import java.util.Scanner;

public class problem_2380 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nume = new int[1000];
        int cont=0;
        for (int i = 0; i < n; i++) {
            nume[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            String binary = Integer.toBinaryString(nume[i]);
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1') {
                    cont++;
                }
            }
        }
        System.out.println(cont);
    }
}
