import java.util.Scanner;

public class JPA210 {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			int num1 = 25;
			int num2 = sc.nextInt();
			if (num2 == 0){
				System.out.println("error:DivideByZeroException");
			}
			else{
				System.out.println(num1/num2);
			}
		} catch (Exception e) {
			System.out.print("error");
			return;
		}
	}
}