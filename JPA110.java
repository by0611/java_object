import java.text.DecimalFormat;
import java.util.Scanner;

public class JPA110 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = 0, n5 = 0, n10 = 0;

		try {
			n1 = sc.nextInt();
		} catch (Exception e) {
			n1 = 0;
			sc.next();
		}
		try {
			n5 = sc.nextInt();
		} catch (Exception e) {
			n5 = 0;
			sc.next();
		}
		try {
			n10 = sc.nextInt();
		} catch (Exception e) {
			n10 = 0;
			sc.next();
		}
		if (n1 < 0){
			n1 = 0;
		}
		else if (n5<0){
			n5 = 0;
		}
		else if (n10<0){
			n10 = 0;
		}
		int total = n1 + n5*5 + n10*10;

		DecimalFormat formatter = new DecimalFormat("#,###");

		System.out.println(formatter.format(total));
	}
}
