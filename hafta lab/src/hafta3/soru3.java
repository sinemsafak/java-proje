package hafta3;

import java.util.Random;
import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        Random rnd = new Random();
        int sayı1 = 1 + rnd.nextInt(30);
        System.out.println(sayı1);
        System.out.println("kaç tahminde bulunacağınızı yazınız");
        int sayac = scann.nextInt();
        int tahmin1 = 0;
        System.out.println("1 ile 30 arasında bir sayı tahmini gir");
        scann.close();
        tahminler(tahmin1, sayı1, sayac);

    }

    public static void tahminler(int tahmin, int sayı, int sayac) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            tahmin = scan.nextInt();
            if (tahmin > sayı && tahmin < 30) {
                System.out.println("tahmininizi küçültün  kalan tahmin hakkınız : " + sayac);
            }

            else if (tahmin < sayı && tahmin < 30) {
                System.out.println("tahmininizi büyültün kalan tahmin hakkınız : " + sayac);
            } else if (tahmin == sayı) {
                System.out.println("tebrikler doğru tahmin ");
                break;
            } else if (tahmin > 30 || tahmin < 1) {
                System.out.println("sayı değer aralığına dikkat edin lütfen kalan tahmin hakkınız : " + sayac);
            }
            sayac--;
        }
        scan.close();

    }
}
