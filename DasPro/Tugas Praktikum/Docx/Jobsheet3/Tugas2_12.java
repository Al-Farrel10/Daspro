import java.util.Scanner;

public class Tugas2_12 {
    public static void main(String[] args) {

        int jumlahLembar;

        int biayaPerLembar = 500;
        int biayaJilid = 5000;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah lembar dokumen : ");
        jumlahLembar = sc.nextInt();

        int totalBiayaCetak = jumlahLembar * biayaPerLembar;
        int totalBayar = totalBiayaCetak + biayaJilid;

        System.out.println("Jumlah Lembar Dokumen : " + jumlahLembar + " lembar");
        System.out.println("Biaya Cetak per Lembar : Rp " + biayaPerLembar);
        System.out.println("Biaya Penjilidan : Rp " + biayaJilid);
        System.out.println("Yang harus dibayar :");
        System.out.println("Total Biaya Cetak : Rp " + totalBiayaCetak);
        System.out.println("Total Harus Dibayar : Rp " + totalBayar);

        sc.close();
    }
}