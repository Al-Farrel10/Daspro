import java.util.Scanner;

public class TugasBioskop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int HARGA_TIKET = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        double totalPenjualan = 0;

        System.out.println("=== Penjualan Tiket Bioskop ===");
        System.out.println("(masukkan 0 untuk mengakhiri penjualan hari ini)");

        while (true) {
            System.out.print("Jumlah tiket yang dibeli pelanggan: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Masukkan jumlah tiket yang benar!");
                continue;
            }

            double harga = jumlahTiket * HARGA_TIKET;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double bayar = harga - (harga * diskon);
            System.out.println("Diskon: " + (int) (diskon * 100) + "%");
            System.out.println("Total bayar pelanggan: Rp " + (long) bayar);

            totalTiket += jumlahTiket;
            totalPenjualan += bayar;
        }

        System.out.println("=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + (long) totalPenjualan);

        sc.close();
    }
}