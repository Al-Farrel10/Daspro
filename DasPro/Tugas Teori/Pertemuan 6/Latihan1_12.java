import java.util.Scanner;

public class Latihan1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan 1: ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        int bil2 = sc.nextInt();
        System.out.print("Masukkan bilangan 3: ");
        int bil3 = sc.nextInt();

        int terbesar;

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                terbesar = bil1;      // bil1 > bil2 dan bil1 > bil3
            } else {
                terbesar = bil3;      // bil3 >= bil1 > bil2
            }
        } else {
            if (bil2 > bil3) {
                terbesar = bil2;      // bil2 >= bil1 dan bil2 > bil3
            } else {
                terbesar = bil3;      // bil3 >= bil2 >= bil1
            }
        }

        System.out.println("Bilangan terbesar: " + terbesar);
        sc.close();

    }
}