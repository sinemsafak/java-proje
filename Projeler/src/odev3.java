import java.util.Scanner;

public class odev3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayıyı giriniz");
        int top = 0;
        int a = scan.nextInt();
        for (int i = 0; i < 3; i++)
            top += a;

        System.out.println(top);

    }
}
