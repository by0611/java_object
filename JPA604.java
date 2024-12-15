import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

abstract class Clerk {
    String name;
    double rate;
    double hours;
    boolean isManager;
    double salary;

    Clerk(String n, double r, double h, boolean i) {
        name = n;
        rate = r;
        hours = h;
        isManager = i;
    }   

    abstract double salary();
}

class PartTime extends Clerk {
    PartTime(String n, double r, double h, boolean i) {
        super(n, r, h, i);
    }

    public double salary() {
        return hours * rate;
    }
}

class FullTime extends Clerk {
    FullTime(String n, double r, double h, boolean i) {
        super(n, r, h, i);
    }

    public double salary() {
        if (this.isManager) {
            return (8 * this.rate + ((this.hours - 8) * this.rate * 0.9)) * 1.2;
        } else {
            return (8 * this.rate+ ((this.hours - 8) * this.rate * 0.9));
        }
    }
}

public class JPA604 {
    public static void main(String argv[]) {
        try {
            String pathname = "read (2).txt";
            File f = new File(pathname);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = "";

            String[] name = new String[7];
            String[] type = new String[7];
            int[] hour = new int[7];

            Scanner sc = new Scanner(System.in);
            String readline = sc.nextLine();
            sc.close();

            // 處理第一行輸入
            double total = 0.0;
            String[] str = readline.split(" ");
            if (str.length != 2) throw new Exception();
            int pMoney = Integer.parseInt(str[0]);
            int fMoney = Integer.parseInt(str[1]);

            for (int i = 0; i < 7; i++) {
                line = br.readLine();
                String[] str1 = line.split(",");
                name[i] = str1[1];
                type[i] = str1[0];
                hour[i] = Integer.parseInt(str1[2]);

                if (type[i].equals("p")) {
                    total += new PartTime(name[i], pMoney, hour[i], false).salary();
                } else if (type[i].equals("f")) {
                    total += new FullTime(name[i], fMoney, hour[i], false).salary();
                } else if (type[i].equals("m")) {
                    total += new FullTime(name[i], fMoney, hour[i], true).salary();
                }
            }

            System.out.printf("PartTime:%d,FullTime:%d,Salary:%.0f", pMoney, fMoney, total);
        } catch (Exception e) {
            System.out.print("error");
            return;
        }
    }
}


// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileReader;
// import java.util.Scanner;

// abstract class Clerk {
//     String name;
//     double rate;
//     double hours;
//     double salary;
//     boolean isManager;

//     Clerk(String n, double r, double h, boolean i) {
//         name = n;
//         rate = r;
//         hours = h;
//         isManager = i;
//     }

//     abstract double salary();
// }

// class PartTime extends Clerk {
//     PartTime(String n, double r, double h, boolean i) {
//         super(n, r, h, i);
//     }

//     public double salary() {
//         return hours * rate;
//     }
// }

// class FullTime extends Clerk {
//     FullTime(String n, double r, double h, boolean i) {
//         super(n, r, h, i);
//     }

//     public double salary() {
//         if(this.isManager){
//             //8 × 每小時標準工資 + ((工作時數 - 8) × 每小時標準工資 × 0.9)
//             return (8 * this.rate + ((this.hours - 8) * this.rate * 0.9)) * 1.2;
//         }else{
//             return 8 * this.rate + ((this.hours - 8) * this.rate * 0.9);
//         }
//     }
// }

// public class JPD604 {
//     public static void main(String argv[]) {

//         try {
//             String pathname = "read.txt";
//             File f = new File(pathname);
//             FileReader fr = new FileReader(f);
//             BufferedReader br = new BufferedReader(fr);
//             String line = "";

//             String[] name = new String[7];
//             String[] type = new String[7];
//             int[] hour = new int[7];

//             Scanner sc = new Scanner(System.in);
//             String readline = sc.nextLine();

//             double total = 0.0;
//             String[] str = readline.split(" ");
//             if(str.length != 2) throw new Exception();
//             int pmoney = Integer.parseInt(str[0]); //part time
//             int fmoney = Integer.parseInt(str[1]); //full time

//             // TO DO
//             for (int i = 0; i < 7; i++){
//                 line = br.readLine();
//                 String[] str1 = line.split(",");
//                 name[i] = str1[1];
//                 type[i] =str1[0];
//                 hour[i] = Integer.parseInt(str1[2]);

//                 if(type[i].equals("p")){
//                     total += new PartTime(name[i], pmoney, hour[i], false).salary();
//                 }else if (type[i].equals("f")) {
//                     total += new FullTime(name[i], fmoney, hour[i], false).salary();
//                 }else if(type[i].equals("m")){
//                     total += new FullTime(name[i], fmoney, hour[i], true).salary();
//                 }
//             }
//             System.out.printf("PartTime:%d,FullTime:%d,Salary:%.0f", pmoney, fmoney, total);
            

            


//             } catch (Exception e) {
//                 System.out.print("error");
//                 return;
//             }
//     }
// }