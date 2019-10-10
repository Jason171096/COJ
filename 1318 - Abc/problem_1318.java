import java.util.Arrays;
import java.util.Scanner;

public class problem_1318 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String num = e.nextLine();
        String[] numsep = num.split(" ");
        Integer[] intarray = new Integer[numsep.length];
        int i = 0;
        for (String str : numsep) {
            intarray[i] = Integer.parseInt(str.trim());
            i++;
        }
        Arrays.sort(intarray);
        int A = intarray[0];
        int B = intarray[1];
        int C = intarray[2];
        String abc = e.nextLine();
        switch(abc)
        {
            case "ABC":
                System.out.println(A+" "+B+" "+C);
                break;
            case "ACB":
                System.out.println(A+" "+C+" "+B);
                break;
            case "BAC":
                System.out.println(B+" "+A+" "+C);
                break;
            case "BCA":
                System.out.println(B+" "+C+" "+A);
                break;
            case "CAB":
                System.out.println(C+" "+A+" "+B);
                break;
            case "CBA":
                System.out.println(C+" "+B+" "+A);
                break;
        }
    }
}
