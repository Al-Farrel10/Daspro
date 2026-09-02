import java.util.Scanner;

public class Segitiga12 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        int alas = scanner.nextInt();

        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt();

        double luasSegitiga = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga: " + luasSegitiga);
    }
}
