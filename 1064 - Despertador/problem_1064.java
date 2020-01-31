import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class problem_1064 {

    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd HH mm");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        int H1, H2, M1, M2;
        do {
            H1 = s.nextInt();
            M1 = s.nextInt();
            H2 = s.nextInt();
            M2 = s.nextInt();
            if(H1 == 0 && M1 == 0 && H2 == 0 && M2 == 0)
                break;
            String hora1 = "0 " + H1 + " " + M1;
            String hora2 = "0 " + H2 + " " + M2;
            Date d1 = sdf.parse(hora1);
            Date d2 = sdf.parse(hora2);
            long ob = (d2.getTime() - d1.getTime()) / 60000;
            if(ob<0)
            {
                hora2 = "1 " + H2 + " " + M2;
                d2 = sdf.parse(hora2);
                ob = (d2.getTime() - d1.getTime()) / 60000;
                System.out.println(ob);
            }
            else
                System.out.println(ob);
        } while (H1 != 0 || M1 != 0 || H2 != 0 || M2 != 0);
    }
}
