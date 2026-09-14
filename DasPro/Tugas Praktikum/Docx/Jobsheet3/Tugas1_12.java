import java.util.Scanner;

public class Tugas1_12 {
    public static void main(String[] args) {
        int harga;
        double dp;
        double sisa;
        double bunga = 0.02;
        int tenor;
        double cicilan;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan harga: ");
        harga = sc.nextInt();

        System.out.print("Masukkan DP: ");
        dp = sc.nextDouble();

        System.out.print("Masukkan tenor (bulan): ");
        tenor = sc.nextInt();

        sisa = harga - dp;
        cicilan = (sisa / tenor) + (sisa * bunga);

        System.out.println("Cicilan per bulan: " + (int) cicilan);

        sc.close();
    }
}