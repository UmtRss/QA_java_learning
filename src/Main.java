public class Main {
    public static void main(String[] args) {
        int not = 85;

        if (not >= 90) {
            System.out.println("Harf Notu: A");
        } else if (not >= 80) {
            System.out.println("Harf Notu: B");
        } else if (not >= 70) {
            System.out.println("Harf Notu: C");
        } else if (not >= 60) {
            System.out.println("Harf Notu: D");
        } else {
            System.out.println("Harf Notu: F");
        }

        // Örnek: sayının pozitif-negatif kontrolü
        int sayi = -5;
        if (sayi > 0) {
            System.out.println("Pozitif");
        } else if (sayi < 0) {
            System.out.println("Negatif");
        } else {
            System.out.println("Sıfır");
        }
    }
}
