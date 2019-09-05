import java.util.Scanner;


public class problem_1483 {
   public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String cad = e.nextLine();
        String[] sep = cad.split(" ");
        int area;
        double areacir;
        if("rectangle".equals(sep[0]))
        {
            area = Integer.parseInt(sep[1]) * Integer.parseInt(sep[2]);
            System.out.println(area);
        }
        if("square".equals(sep[0]))
        {
            area = Integer.parseInt(sep[1]) * Integer.parseInt(sep[1]);
            System.out.println(area);
        }
        if("triangle".equals(sep[0]))
        {
            area = Integer.parseInt(sep[1]) * Integer.parseInt(sep[2]);
            System.out.println(area);
        }
        if("circle".equals(sep[0]))
        {
            areacir = Math.PI * (Double.parseDouble(sep[1]) * Double.parseDouble(sep[1]));
            System.out.println(areacir);
        }
        
    }
} 
