import java.util.Scanner;
public class MenghitungTotalBayar12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double harga;
        double potongan;
        double jml_Bayar;
        double diskon=0.15;

        System.out.println("Masukkan harga barang: ");
        harga= input.nextInt();
        potongan = harga*diskon;
        jml_Bayar = harga - potongan;
        System.out.println("Jumlah bayar adalah: "+jml_Bayar);
        input.close();
    }
}