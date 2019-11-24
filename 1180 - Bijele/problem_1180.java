import java.util.Scanner;

public class problem_1180 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int casos = e.nextInt();
        int[] array = new int[6];
        int[] arraydef = {1, 1, 2, 2, 2, 8};
        
        for (int i = 0; i < casos; i++) 
        {
            String concatena = "";
            for (int j = 0; j < 6; j++) 
            {
                array[j] = e.nextInt();
            }
            for(int k=0; k<6; k++)
            {
                concatena += arraydef[k] - array[k] + " ";
            }
            String subconca = concatena.substring(0, concatena.length()-1);
            System.out.println(subconca);
        }
    }
}
