import java.util.Scanner;

public class Latihan3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kategori, altKategori;
        int harga, minUkuran, maxUkuran;
        int altHarga, altMin, altMax;

        System.out.print("Silahkan pilih merek (Converse/Sketcher/Nike) : ");
        String merek = sc.nextLine();

        if (merek.equalsIgnoreCase("Converse")) {
            System.out.print("Silahkan pilih kategori (Slip On/High Top) : ");
            String pilihan = sc.nextLine();

            if (pilihan.equalsIgnoreCase("Slip On")) {
                kategori = "Slip On";
                harga = 800000;  minUkuran = 36;  maxUkuran = 40;
                altKategori = "High Top";
                altHarga = 1200000;  altMin = 40;  altMax = 44;
            } else {
                kategori = "High Top";
                harga = 1200000;  minUkuran = 40;  maxUkuran = 44;
                altKategori = "Slip On";
                altHarga = 800000;  altMin = 36;  altMax = 40;
            }
        } else if (merek.equalsIgnoreCase("Sketcher")) {
            System.out.print("Silahkan pilih kategori (Woman/Man) : ");
            String pilihan = sc.nextLine();

            if (pilihan.equalsIgnoreCase("Woman")) {
                kategori = "Woman";
                harga = 1000000;  minUkuran = 36;  maxUkuran = 41;
                altKategori = "Man";
                altHarga = 1800000;  altMin = 41;  altMax = 44;
            } else {
                kategori = "Man";
                harga = 1800000;  minUkuran = 41;  maxUkuran = 44;
                altKategori = "Woman";
                altHarga = 1000000;  altMin = 36;  altMax = 41;
            }
        } else if (merek.equalsIgnoreCase("Nike")) {
            System.out.print("Silahkan pilih kategori (Kids/Adult) : ");
            String pilihan = sc.nextLine();

            if (pilihan.equalsIgnoreCase("Kids")) {
                kategori = "Kids";
                harga = 750000;  minUkuran = 36;  maxUkuran = 40;
                altKategori = "Adult";
                altHarga = 1500000;  altMin = 40;  altMax = 44;
            } else {
                kategori = "Adult";
                harga = 1500000;  minUkuran = 40;  maxUkuran = 44;
                altKategori = "Kids";
                altHarga = 750000;  altMin = 36;  altMax = 40;
            }
        } else {
            System.out.println("Maaf, merek \"" + merek + "\" tidak tersedia.");
            System.out.println("Silahkan pilih salah satu: Converse, Sketcher, atau Nike.");
            return;
        }

        System.out.print("Silahkan masukkan ukuran (" + minUkuran + "-" + maxUkuran + ") : ");
        int ukuran = sc.nextInt();

        if (ukuran >= minUkuran) {
            if (ukuran <= maxUkuran) {
                System.out.println("Harga sepatu : Rp " + harga);
            } else {
                if (ukuran <= altMax) {
                    System.out.println("Ukuran " + ukuran + " tidak tersedia di kategori " + kategori);
                    System.out.println("Rekomendasi: kategori " + altKategori
                            + " (ukuran " + altMin + "-" + altMax + ") Rp " + altHarga);
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            }
        } else {
            if (ukuran >= altMin) {
                System.out.println("Ukuran " + ukuran + " tidak tersedia di kategori " + kategori);
                System.out.println("Rekomendasi: kategori " + altKategori
                        + " (ukuran " + altMin + "-" + altMax + ") Rp " + altHarga);
            } else {
                System.out.println("Ukuran tidak tersedia");
                sc.close();
            }
        }
    }
}