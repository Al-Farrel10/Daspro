import java.util.Scanner;

public class Latihan1_5_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jamParkir;
        System.out.print("Masukkan lama parkir parkir: ");
        jamParkir = sc.nextInt();
        int tarif;

        if (jamParkir <= 2) {
            tarif = 2000;
        } else {
            tarif = 2000 + (jamParkir - 2) * 1000;
        }
        System.out.println("Biaya parkir: Rp. " + tarif);
        sc.close();
    }
}