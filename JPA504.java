import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class JPA504 {

    public static void main(String[] args) {

        String[] new_student = { "Sam", "1981/10/1", "A234567890" };

        try {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            sc.close();
            String[] scores = input.split(" ");
            int[] intScores = new int[3];
            for (int i = 0; i < 3; i++) {
                intScores[i] = Integer.parseInt(scores[i]);
                if (intScores[i] < 0 || intScores[i] > 100)  throw new Exception();
            }
            StringBuilder result = new StringBuilder(String.join(",", new_student));

            for (int score : intScores) {
                result.append(",").append(score);
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("write.txt", true))) {
                writer.write(result.toString());
                writer.newLine();
            }

            System.out.print(result.toString());

        } catch (Exception ex) {
            System.out.print("error");
        }
    }
}
