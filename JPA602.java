import java.util.Scanner;

enum Colors {
    RED, BLUE, WHITE
}

class Car {
    int cc, seat, door;
    Colors color;

    public Car(int cc, Colors color, int door, int seat) {
        this.cc = cc;
        this.color = color;
        this.door = door;
        this.seat = seat;
    }

    public String show() {
        return this.cc + "cc" + this.seat+ this.color + this.door ;
    }
}

public class JPA602 {
    public static void main(String args[]) {
        String input = null;
        try {
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            sc.close();

            String[] strings = input.split(" ");
            int cc = Integer.valueOf(strings[0]);
            int seat = Integer.valueOf(strings[1]);
            int color = Integer.valueOf(strings[2]);
            int door = Integer.valueOf(strings[3]);

            if (color == 1) {
                System.out.println(new Car(cc, Colors.RED, door, seat).show());
            } else if (color == 2) {
                System.out.println(new Car(cc, Colors.BLUE, door, seat).show());
            } else if (color == 3) {
                System.out.println(new Car(cc, Colors.WHITE, door, seat).show());
            } else {
                throw new Exception();
            }
        } catch (Exception ex) {
            System.out.print("error");
            return;
        }
    }
}
