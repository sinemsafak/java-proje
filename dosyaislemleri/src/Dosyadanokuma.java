import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;

public class Dosyadanokuma {
    public static void main(String[] args) {

        try {

            String fileName = "src/odev2.csv";
            File file = new File(fileName);

            // this gives you a 2-dimensional array of strings
            List<List<String>> lines = new ArrayList<>();
            Scanner inputStream;

            try {
                inputStream = new Scanner(file);

                while (inputStream.hasNext()) {
                    String line = inputStream.next();
                    String[] values = line.replace(" ", "").split(",");
                    // this adds the currently parsed line to the 2-dimensional string array
                    lines.add(Arrays.asList(values));
                }

                inputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            // the following code lets you iterate through the 2-dimensional array
            int lineNo = 1;
            for (List<String> line : lines) {
                System.out.println("satir " + lineNo + " " + line.get(0) + " " + line.get(1) + " " + line.get(2));
                lineNo++;
            }
            excelolustur();

            FileWriter daktilo = new FileWriter("src/output.csv");
            int lineNo2 = 1;
            for (List<String> line : lines) {
                if (lineNo2 == 1) {
                    daktilo.append(line.get(0) + "," + line.get(1) + "," + line.get(2) + System.lineSeparator());
                }
                if (lineNo2 != 1 && Integer.parseInt((line.get(2))) > 25) {
                    daktilo.append(line.get(0) + "," + line.get(1) + "," + line.get(2) + System.lineSeparator());
                }
                lineNo2++;
            }

            System.out.println("data dosya i??ine kaydedildi.");
            daktilo.close();

        } catch (Exception e) {

            e.getStackTrace();
        }

    }

    public static void excelolustur() {
        // src dosyas?? i??inde bir file nesnesi olu??turuyoruz
        File file = new File("src/output.csv");

        try {
            // file nesnesine ba??l?? bir code olu??turuyoruz
            // e??er dosya varsa bu dosya zaten var uyar??s?? al??yoruz
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("Yeni dosya olu??turuldu.");
            } else {
                System.out.println("Bu isimde dosya zaten mevcut");
            }
        } catch (Exception e) {

            e.getStackTrace();
        }
    }

}
