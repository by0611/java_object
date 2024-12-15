import java.util.Scanner;

public class JPA202 {

	public static void main(String[] args) {

		int num = 0;

		try {
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();

		} catch (Exception e) {
			System.out.println("error");
            return;
		}

        if (num % 2 == 0){
			System.out.print( num + " is an even number.");
		}
        else{
			System.out.print( num + " is an odd number.");
		}     
	}
}