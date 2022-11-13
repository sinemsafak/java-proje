package hafta3;

import java.util.Random;
import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int sayı1 = 1 + rnd.nextInt(30);
        System.out.println(sayı1);
        System.out.println("1 ile 30 arasında bir sayı tahmini gir");
        int tahmin1 = 0;
        tahminler(tahmin1, sayı1);

    }

    public static void tahminler(int tahmin, int sayı) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            tahmin = scan.nextInt();
            if (tahmin > sayı && tahmin < 30) {
                System.out.println("tahmininizi küçültün kalan hakkınız ");
            }

            else if (tahmin < sayı && tahmin < 30) {
                System.out.println("tahmininizi büyültün kalan hakkınız ");
            } else if (tahmin == sayı) {
                System.out.println("tebrikler doğru tahmin ");
                break;
            } else if (tahmin > 30 || tahmin < 1) {
                System.out.println("sayı değer aralığına dikkat edin lütfen");
            }
        }
        scan.close();

    }
}
