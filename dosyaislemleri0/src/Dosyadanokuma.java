import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.io.FileWriter;

public class Dosyadanokuma {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> list = new ArrayList<String>();
        String adsoyadyas = "";
        int sayac = 0;

        try {

            InputStream input = new FileInputStream("src/odev.csv");
            System.out.println("\n\ndosya içindeki veriler : \n");

            int i = input.read();

            while (i != -1) {
                adsoyadyas += (char) i;

                switch ((char) i) {
                    case ',':
                        sayac++;

                        adsoyadyas.replace(",", "");
                        adsoyadyas.split(" ");
                        list.add(adsoyadyas);
                        adsoyadyas = "";

                        break;
                }

                i = input.read();

            }
            input.close();
            int yas = 0;
            String deneme;
            String[] yaslar = new String[list.size()];

            for (int y = 0; y < list.size(); y++) {
                yaslar[y] = list.get(y);

                yaslar[y] = yaslar[y].replace(",", "");

            }
            FileWriter daktilo = new FileWriter("src/output.csv");
            for (int x = 2; x < list.size(); x += 3) {

                deneme = yaslar[x];
                System.out.println(deneme);

                // if (Integer.parseInt(deneme) > 25) {
                // System.out.println("deneme");

                // Dosyaolusturma.exceloluştur();

                // try {

                // daktilo.write(list.get(x - 2));
                // daktilo.write(list.get(x - 1));
                // daktilo.write(list.get(x) + "\n");
                // daktilo.close();
                // System.out.println("data dosya içine kaydedildi.");

                // } catch (Exception e) {

                // e.getStackTrace();
                // }

                // } else {
                // System.out.println("kişinin yalı 25 den küçük");
                // }

            }

        } catch (Exception e) {

            e.getStackTrace();
        }

    }

}
