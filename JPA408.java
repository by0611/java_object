import java.util.Scanner;

public class JPA408 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
           
            String[] parts = input.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);

            if (minutes < 0 || minutes >= 60)  throw new Exception();
                
            int days = hours / 8;
            int AnsHours = hours % 8;

            System.out.printf("%dd:%dh:%dm", days, AnsHours, minutes);

        } catch (Exception ex) {
            System.out.print("error");
        }
    }
}
