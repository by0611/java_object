import java.util.Scanner;
 
public class JPA102 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        try {
            num1 = sc.nextInt();
        } catch (Exception ex) {            
            num1 = 0;
            sc.next();          
        }
 
        try {
            num2 = sc.nextInt();
        } catch (Exception e) {
            num2 = 0;
			sc.next();
        }
        if (num1 % 2 != 0){
			num1 = 0;
		} 
        if (num2 % 2 != 0){
			num2 = 0;
		} 
		System.out.println(num1 + num2);
       
    }
}