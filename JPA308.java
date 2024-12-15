import java.util.Scanner;

public class JPA308 {

	public static void main(String[] args) {

		int[] scores = { 100, 100, 95, 95, 92, 91, 90, 100, 88, 88, 87, 87, 90, 91, 85, 80, 81, 82, 82, 89 };
		int count = 0; 
		int num = 0;
		try{
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
		}
		catch(Exception e){
			num = 0;
		}
		try {
			for (int i = 0;i < scores.length;i++){
				if (scores[i]==num){
					count++;
				}
			}
			System.out.println(count);
		} catch (Exception e) {
			System.out.print("error");
			return;
		}
	}
}
