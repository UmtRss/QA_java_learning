public class Main {
    public static void main(String[] args) {
       int [] sayilar = {10, 20, 30, 40, 50};

       //Navigate Array with FOR
        for ( int i = 0; i < sayilar.length; i++) {
            System.out.println("FOR Element: " + sayilar [i]);
        }
        // Navigate Array with WHILE
        int j = 0;
        while (j < sayilar.length) {
            System.out.println("WHILE Element: " + sayilar[j]);
            j++;
        }
        // Navigate Array with DO-WHILE
        int k = 0;
        do {
            System.out.println("DO-WHILE Element: " + sayilar[k]);
            k++;
        } while (k < sayilar.length);

    }
}