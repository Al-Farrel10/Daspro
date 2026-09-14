import java.util.Scanner;

public class MenghitungLuasPersegiPanjang12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int panjang;
        int lebar;
        int luas;
        
        System.out.println("Masukkan panjang persegi panjang: ");
        panjang=input.nextInt();
        System.out.println("Masukkan lebar persegi panjang: ");
        lebar=input.nextInt();
        luas=panjang*lebar;
        System.out.println("Luas persegi panjang adalah: "+luas);
        luas=panjang*lebar;
        input.close();
    }
}