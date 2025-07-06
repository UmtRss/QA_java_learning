public class Main {
    public static void main(String[] args) {
        // Switch-case örneği
        int gun = 3;

        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçersiz gün");
        }

        // Ternary örneği
        int sayi = -10;
        String sonuc = (sayi >= 0) ? "Pozitif veya Sıfır" : "Negatif";
        System.out.println(sonuc);
    }
}
