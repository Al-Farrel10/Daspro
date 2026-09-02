import java.util.Scanner;

public class Kasus1_12 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int panjang, lebar, keliling;
        
        System.out.print("Masukkan panjang: ");
        panjang = input.nextInt();
        
        System.out.print("Masukkan lebar: "); 
        lebar = input.nextInt();
        
        keliling = 2 * (panjang + lebar);
        
        System.out.println("Keliling = " + keliling);
        input.close();
    }
}