import java.util.Scanner;

public class JPA108 {

	public static void main(String[] args) {
		double num = 0;
		try {
			Scanner sc = new Scanner(System.in);
			num = sc.nextFloat();
			double NUM = f(num);
			System.out.printf("%.4f",NUM);
		} catch (Exception e) {
			System.out.print("error");
		}
	}

	public static double f(double num) {
		double n;
		n = 2*(Math.pow(num, 3)) + 3*num - 1;
		return n;
	}
}