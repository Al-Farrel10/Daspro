import java.util.Scanner;

public class Studikasus2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa: ");
        String nama = sc.nextLine();

        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenis = sc.nextLine();

        System.out.print("Jumlah dokumen: ");
        int jumlahDokumen = sc.nextInt();

        boolean berhak = false;
        String alasan = "";

        // Tingkat 1: cek jenis kegiatan
        if (jenis.equalsIgnoreCase("BELMAWA")
                || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("MANDIRI")) {

            // Program hanya menanyakan data yang diperlukan untuk lomba
            System.out.print("Peringkat juara: ");
            int juara = sc.nextInt();

            // Tingkat 2: cek peringkat juara
            if (juara >= 1 && juara <= 3) {
                berhak = true;
            } else {
                alasan = "Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).";
            }

        } else if (jenis.equalsIgnoreCase("PKM")) {

            // Program hanya menanyakan data yang diperlukan untuk PKM
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            int pendanaan = sc.nextInt();

            // Tingkat 2: cek status pendanaan
            if (pendanaan == 1) {
                berhak = true;
            } else {
                alasan = "Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).";
            }

        } else {
            alasan = "Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).";
        }

        // Tingkat 2/3: jika berhak, cek kelengkapan dokumen
        if (berhak) {
            if (jumlahDokumen >= 4) {
                System.out.println("Status: Berhak memperoleh dana penghargaan.");
            } else {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang
                        + " dokumen). Dana penghargaan tidak diberikan.");
            }
        } else {
            System.out.println("Status: " + alasan);
        }

        sc.close();
    }
}