import java.util.Scanner;

public class problem_1252 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String cadena;

        String space = "%20";
        String exclamation_point = "%21";
        String dollar_sign = "%24";
        String percent_sign = "%25";
        String left_parenthesis = "%28";
        String right_parenthesis = "%29";
        String asterisk = "%2a";

        while (!"#".equals(cadena = e.nextLine())) 
        {
            if (cadena.contains(" ") 
                    || cadena.contains("!")
                    || cadena.contains("$")
                    || cadena.contains("%")
                    || cadena.contains("(") 
                    || cadena.contains(")")
                    || cadena.contains("*")
            )
            {
                cadena = cadena.replace("%", percent_sign);
                cadena = cadena.replace(" ", space);
                cadena = cadena.replace("!", exclamation_point);
                cadena = cadena.replace("$", dollar_sign);
                cadena = cadena.replace("(", left_parenthesis);
                cadena = cadena.replace(")", right_parenthesis);
                cadena = cadena.replace("*", asterisk);
                System.out.println(cadena);
            }
            else
                System.out.println(cadena);      
        }
    }
}
