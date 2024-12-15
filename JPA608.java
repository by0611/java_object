import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

class Bag {
    String receiptdate;
    int freight;
    int unitcost;

    Bag() {
    }
}

// TO DO - class Air
class Air extends Bag {
    int deliveryhours;

    public Air(int deliveryhours, int unitcost) {
        this.deliveryhours = deliveryhours;
        this.unitcost = unitcost;
    }

    public double computeFreight() {
        return this.unitcost * this.deliveryhours;
    }
}

public class JPA608 {
    public static void main(String args[]) {
        try {
            String pathname = "read.txt";
            File f = new File(pathname);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            String[] date = new String[5];
            int[] hour = new int[5];
            Scanner sc = new Scanner(System.in);
            int cost = sc.nextInt();
            int total = 0;
            if (cost < 0) throw new Exception();
            for (int i = 0; i < 5; i++) {
                hour[i] = Integer.parseInt(br.readLine().split(",")[1]);
                total += new Air(hour[i], cost).computeFreight();
            }
            System.out.println(total);

        } catch (Exception e) {
            System.out.print("error");
            return;
        }
    }
}

