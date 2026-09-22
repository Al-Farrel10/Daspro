public class Try_12 {
    public static void main(String[] args) {
        int x,y,z;
        x = 100;
        y = 99;
        z = 99;
        System.out.println("Nilai x = "+x);
        System.out.println("Nilai y = "+y);
        System.out.println("Nilai z = "+z);
        //operator sama dengan
        if(y == z) {
            System.out.println("Y sama dengan Z");
        }else {
            System.out.println("Y tidak sama dengan Z");
        }
        //operator tidak sama dengan
        if(x != y) {
            System.out.println("X tidak sama dengan Y");
        }else {
            System.out.println("X sama dengan Y");
        }
        //operator lebih besar dari
        if(x > y) {
            System.out.println("X lebih besar dari Y");
        }else {
            System.out.println("X lebih kecil dari Y");
        }
    }
    
}
