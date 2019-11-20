import java.util.Scanner;

public class problem_2960 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String cadena = e.nextLine();
        int cont =0;
        for(int i =0; i<cadena.length(); i++)
        {
            switch (cadena.charAt(i)) {
                case 'A':
                    cont++;
                    break;
                case 'B':
                    cont+=2;
                    break;
                case 'D':
                    cont++;
                    break;
                case 'O':
                    cont++;
                    break;
                case 'P':
                    cont++;
                    break;
                case 'Q':
                    cont++;
                    break;
                case 'R':
                    cont++;
                    break;
                default:
                    break;
            }
        }
        System.out.println(cont);
    }   
}
