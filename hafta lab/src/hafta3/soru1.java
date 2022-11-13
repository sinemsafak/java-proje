package hafta3;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int puan = 0;
        System.out.println("sınav puanınızı giriniz : ");
        puan = scan.nextInt();
        scan.close();
        harfdeger(puan);
    }

    public static void harfdeger(int a) {
        if (a >= 85 && a < 100) {
            System.out.println("A");

        }
        if (a >= 75 && a < 85) {
            System.out.println("B");

        }
        if (a >= 60 && a < 74) {
            System.out.println("C");
        }
        if (a >= 45 && a < 59) {
            System.out.println("D");
        }
        if (a >= 30 && a < 44) {
            System.out.println("E");
        }
        if (a >= 0 && a < 29) {
            System.out.println("F");
        }

    }
}
