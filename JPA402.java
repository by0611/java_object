import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JPA402 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            
            String input1 = sc.next();
            String input2 = sc.next();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            sdf.setLenient(false); 

            Date date1 = sdf.parse(input1);
            Date date2 = sdf.parse(input2);
        
            long difference = Math.abs(date1.getTime() - date2.getTime());
            long daysDifference = difference / (1000 * 60 * 60 * 24);
            
            System.out.print(daysDifference);

        } catch (Exception ex) {
            System.out.print("error");
        }
    }
}
