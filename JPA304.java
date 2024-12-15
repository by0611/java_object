import java.util.Scanner;
public class JPA304 {

    public static void main(String[] args) {

        int[] scores = { 100, 100, 95, 95, 92, 91, 90, 100, 88, 88, 87, 87, 90, 91, 85, 80, 81, 82, 82, 89 };
        Scanner sc = new Scanner(System.in);
        int num = 0;

        try {
            num = sc.nextInt();
        } catch (Exception e) {
            num = 0; 
        }

        int sum = 0;
        int count = 0;
        for (int i = 0;i < scores.length;i++) {
            if (scores[i] != num) {
                sum += scores[i];
                count++;
            }
        }
        double average = 0;
        if (count > 0){
            average = sum / count;  
        }   
        else{
            average = 0;
        }
        System.out.printf("%.2f%n", average);
        sc.close(); 
    }
}
