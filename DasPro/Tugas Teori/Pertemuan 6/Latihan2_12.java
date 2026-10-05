import java.util.Scanner;

public class Latihan2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hari, jenis;
        int jumlah;
        double diskon = 0;

        System.out.print("Masukkan hari pembelian : ");
        hari = sc.nextLine();
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya) : ");
        jenis = sc.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jumlah = sc.nextInt();

        if (hari.equals("Rabu")) {
            // Diskon hanya berlaku hari Rabu
            if (jenis.equals("kamus")) {
                diskon = 10;
                if (jumlah > 2) {
                    diskon = diskon + 2;
                }
            } else if (jenis.equals("novel")) {
                diskon = 7;
                if (jumlah > 3) {
                    diskon = diskon + 2;
                } else {
                    diskon = diskon + 1;
                }
            } else {
                if (jumlah > 3) {
                    diskon = 5;
                }
            }
        } else {
            diskon = 0;
        }

        // di luar hari Rabu tidak ada diskon

        if (diskon > 0) {
            System.out.println("Jumlah diskon : " + diskon + "%");
        } else {
            System.out.println("Tidak ada diskon (promo hanya berlaku hari Rabu).");
            sc.close();
        }
    }
}