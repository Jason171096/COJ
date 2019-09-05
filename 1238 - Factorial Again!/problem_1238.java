import java.util.Scanner;


public class problem_1238 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out,false);
        int num;
        while((num =e.nextInt())!=0)
        {
            String numstring = Integer.toString(num);
            StringBuilder rever = new StringBuilder();
            rever.append(numstring);
            rever = rever.reverse();
//          String[] array = new String[numstring.length()];
//            for(int i = 0; i < numstring.length(); i++)
//	    {
//	        array[i] = String.valueOf(numstring.charAt(i));
//	    }
//          Collections.reverse(Arrays.asList(array));
            int cont=1;
            int total=0;
            for(int i=1; i<rever.length()+1; i++)
            {
                cont = cont*i;
                total += (rever.charAt(i-1)-48)*(cont);
            }
            pw.println(total);
        } 
        pw.close();
    }
}
