import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {
        int top = 0, a;

        for (int i = 1; i <= 5; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println(" sayıyı giriniz");

            a = scan.nextInt();
            top += a;

        }
        System.out.println(top);
    }
}
