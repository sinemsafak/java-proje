import java.util.Scanner;

public class no_ort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci ve ikinci notunuzu giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int ort;
        ort = (a + b) / 2;
        if (ort >= 70)
            System.out.println("iyi");
        else
            System.out.println("kötü");
    }
}
