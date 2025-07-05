public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Aritmetik
        System.out.println("Toplam: " + (a + b));
        System.out.println("Fark: " + (a - b));
        System.out.println("Çarpım: " + (a * b));
        System.out.println("Bölüm: " + (a / b));
        System.out.println("Kalan: " + (a % b));

        // Karşılaştırma
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Mantıksal
        System.out.println("(a > 5) && (b < 5): " + ((a > 5) && (b < 5)));
        System.out.println("(a < 5) || (b < 5): " + ((a < 5) || (b < 5)));
        System.out.println("!(a == b): " + (!(a == b)));
    }
}
