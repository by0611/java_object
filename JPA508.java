import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class JPA508 {

    public static void main(String[] args) {

        try {
            String path = "read.txt";
            File f = new File(path);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            sc.close();

            int btotal = 0, bcount = 0;
            int gtotal = 0, gcount = 0;

            for (int i = 0; i < input; i++) {
                String s = br.readLine();
                String[] ss = s.split(",");
                String sex = ss[1].substring(1, 2);
                if (sex.equals("1")) {
                    bcount++;
                    btotal += Integer.parseInt(ss[2]) + Integer.parseInt(ss[3]) + Integer.parseInt(ss[4]);
                } else {
                    gcount++;
                    gtotal += Integer.parseInt(ss[2]) + Integer.parseInt(ss[3]) + Integer.parseInt(ss[4]);
                }
            }

            int bavg, gavg;

        if (bcount > 0) {
            bavg = btotal / bcount / 3;
        } else {
            bavg = 0;
        }
        if (gcount > 0) {
            gavg = gtotal / gcount / 3;
        } else {
            gavg = 0;
        }
        System.out.print("boys:" + bavg + "," + "girls:" + gavg);

        } catch (Exception ex) {
            System.out.print("error");
            return;
        }
    }
}
