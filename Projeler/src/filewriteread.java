import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.print.attribute.standard.Fidelity;

public class filewriteread {
    public static void main(String[] args) throws FileNotFoundException {
        File HaftaOdev = new File("HaftaOdev.csv");
        if (HaftaOdev.exists())
            System.out.println("Bulundu");
        else
            System.out.println("Bulunamadı");
        Scanner filescan = new Scanner(HaftaOdev);
        while (filescan.hasNextLine()) {
            System.out.println(filescan.nextLine());
        }

        filescan.close();
    }
}
