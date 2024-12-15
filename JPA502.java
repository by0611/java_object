import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class JPA502 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            sc.close();
			
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("write.txt"))) {
                writer.write(input);
            }

            String content;
            try (BufferedReader reader = new BufferedReader(new FileReader("write.txt"))) {
                content = reader.readLine();
            }
            print(content);

        } catch (Exception e) {
            System.out.print("error");
        }
    }
    public static void print(String line) {
        System.out.print("write:" + line);
    }
}
