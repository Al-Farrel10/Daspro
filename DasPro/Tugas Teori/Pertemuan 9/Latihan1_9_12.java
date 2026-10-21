import java.util.Scanner;

public class Latihan1_9_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        for (int i = 1; i <= 7; i++) {
            double jam;
            do {
                System.out.print("Masukkan jam belajar hari ke-" + i + ": ");
                jam = sc.nextDouble();
                if (jam > 10) {
                    System.out.println("Input tidak valid jam belajar tidak boleh lebih dari 10 jam perhari, silahkan input ulang!");
                }
            } while (jam > 10);

            total += jam;
        }

        System.out.println("Total jam belajar seminggu: " + total + " jam");
        sc.close();
    }
}