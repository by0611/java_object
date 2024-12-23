import java.util.Scanner;

public class JPA410 {

    public static void main(String[] args) {

        String[] birthday = { 
            "1980/1/11", "1985/3/2", "1985/12/3", "1986/6/3", "1986/11/14", 
            "1987/2/2", "1987/8/1", "1987/10/12", "1987/9/3", "1987/8/1", 
            "1987/4/12", "1988/1/3", "1987/5/6", "1987/6/7", "1987/8/19", 
            "1987/6/13", "1987/10/9", "1986/4/8", "1987/5/15", "1987/2/19", 
            "1987/3/15", "1987/3/11", "1987/3/31"
        };

        try {
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            
            int month = Integer.parseInt(input);
            if (month < 1 || month > 12) throw new Exception();

            int count = 0;
            for (String date : birthday) {
                String[] parts = date.split("/"); 
                int birthMonth = Integer.parseInt(parts[1]);
                if (birthMonth == month) {
                    count++;
                }
            }
            System.out.print(count);

        } catch (Exception ex) {
            System.out.print("error");
        }
    }
}
