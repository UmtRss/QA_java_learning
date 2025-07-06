public class Main {
    public static void main(String[] args) {
        selamla();

        int toplamSonuc = topla(10,20);
        System.out.println("Toplam Sonucu: " + toplamSonuc);

        yazCarpim(5,4);
    }

    // Void Method
    public static void selamla() {
        System.out.println("Merhaba QA: ");
    }
    // Method with return
    public static int topla(int x, int y) {
        return x+y;
    }

    // Void Method with adding parameters
    public static void yazCarpim( int x, int y) {
        System.out.println("Çarpım: " + (x * y));
    }
}