import java.util.Scanner;

public class GajiKaryawan12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int gajiPokok;
        double bonus, totGaji;
        double tunjTransp=600000;
        double tunjMakan=400000;

        System.out.println("Masukkan gaji pokok karyawan: ");
        gajiPokok= input.nextInt();
        bonus= 0.05*gajiPokok;
        System.out.println("Masukkan bonus: ");
        bonus= input.nextDouble();
        totGaji= gajiPokok+bonus+tunjTransp+tunjMakan-0.1*gajiPokok;
        System.out.println("Gaji yang diterima adalah: Rp. "+(int)totGaji);
        System.out.println("Bonus karyawan adalah: Rp."+(int)bonus);
        System.out.println("Gaji pokok karyawan adalah: Rp."+gajiPokok);
        
        input.close();
    }
}