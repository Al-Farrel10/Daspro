import java.util.Scanner;

public class sks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah SKS : ");
        int jumlahSKS = sc.nextInt();

        if (jumlahSKS < 24) {
            System.out.println("KRS Valid");
        } else {
            System.out.println("Melebihi batas");
            sc.close();
        }
    }
}