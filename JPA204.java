import java.util.Scanner;

public class JPA204 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;

		try {
			a = sc.nextInt();
			b = sc.nextInt();
		} catch (Exception e) {
			System.out.print("error");
			return;
		}
		if (a < 1 || b < 1 || a > 100 || b > 100){
			System.out.print("error");
			System.exit(0);
		}
		for (int i = a; i <= b ;i++){
			if (isprime(i)){
				System.out.println(i);
				}
			}
		}

	public static boolean isprime(int num){
		int count = 0;
		for (int i = 1;i < num;i++){
			if (num % i == 0){
				count++;
			}
		}
		if (count == 1){
			return true;
		}
		else{
			return false;
		}
	}

}

