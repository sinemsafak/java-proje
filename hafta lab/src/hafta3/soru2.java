package hafta3;

import java.util.Scanner;

public class soru2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kaç sayı gireceğinizi yazınız");
        int kacsayı = scan.nextInt();

        Integer[] sayılar = new Integer[kacsayı];

        degeratama(kacsayı, sayılar);

        yaz(kacsayı, sayılar);
        scan.close();

    }

    public static Integer[] degeratama(int kacsayı2, Integer[] sayılar1) {
        int sayı1 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println(kacsayı2 + " kadar sayı girniz : ");

        for (int i = 0; i < kacsayı2; i++) {
            sayı1 = scan.nextInt();

            sayılar1[i] = sayı1;

        }
        scan.close();

        return sayılar1;

    }

    public static void yaz(int kacsayı2, Integer[] a) {

        System.out.println("-------------------------");
        System.out.println("dizimizde kayıtlı indexs değerleri");

        for (int i : a) {
            System.out.println(i);
        }

    }

}
