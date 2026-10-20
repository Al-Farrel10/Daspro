import java.util.Scanner;

public class Latihan2_9_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalBonus = 0;
        double totalGaji = 0;

        System.out.print("Masukkan jam kerja (negatif untuk berhenti): ");
        double jam = sc.nextDouble();

        while (jam >= 0) {
            if (jam == 0) {
                System.out.println("PERINGATAN: Jam kerja tidak boleh 0! Silakan masukkan ulang.");
            } else {
                System.out.print("Masukkan gaji harian: ");
                double gaji = sc.nextDouble();

                double bonus = 0;
                if (jam > 8) {
                    bonus = 0.20 * gaji;
                }

                double gajiDiterima = gaji + bonus;

                System.out.println("Bonus pegawai: Rp " + bonus);
                System.out.println("Total gaji pegawai (gaji + bonus): Rp " + gajiDiterima);

                totalBonus += bonus;
                totalGaji += gajiDiterima;
            }

            System.out.print("Masukkan jam kerja (negatif untuk berhenti): ");
            jam = sc.nextDouble();
        }

        System.out.println("Total bonus seluruh pegawai: Rp " + totalBonus);
        System.out.println("Total gaji seluruh pegawai: Rp " + totalGaji);
        sc.close();
    }
}