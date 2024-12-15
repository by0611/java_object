import java.util.Scanner;

public class JPA306 {

    public static void main(String args[]) {

        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int b[][] = new int[2][3];
        int c[][] = new int[2][3];

        Scanner sc = new Scanner(System.in);
        
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    if (sc.hasNextInt()) {
                        int input = sc.nextInt();
                        if (input < 1 || input > 100) {
                            System.out.println("error");
                            return;
                        }
                        b[i][j] = input;
                    } else {
                        System.out.println("error");
                        return;
                    }
                }
            }
        

        compute(a, b, c);
        print(c);
    }

    public static void compute(int[][] a, int[][] b, int[][] c) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    public static void print(int[][] s) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4d", s[i][j]);
            }
            System.out.println();
        }
    }
}    