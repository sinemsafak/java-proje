
import java.util.ArrayList;

//import javax.swing.InputMap;
import java.io.FileInputStream;
import java.io.InputStream;

public class dosyaokumaclean {
    public static void main(String[] args) {

        ArrayList<String> adsoyadyas = new ArrayList<String>();
        String denemeString = "";
        int sayac = 0;

        try {

            InputStream input = new FileInputStream("src/odev.csv");
            System.out.println("\n\ndosya içindeki veriler : \n");

            int i = input.read();
            while (i != -1) {

                char karakter = (char) i;

                i = input.read();

                denemeString += String.valueOf(karakter);
                switch (karakter) {
                    case ',': {

                        sayac++;

                        if (sayac == 3) {

                            sayac = 0;

                            adsoyadyas.add(denemeString);
                            denemeString = "";

                        }
                        break;
                    }
                    default:

                        break;
                }

            }

            input.close();

        } catch (Exception e) {

            e.getStackTrace();
        }

        for (String dene : adsoyadyas) {

            char[] sembol = dene.toCharArray();
            for (char sem : sembol) {

                switch (sem) {
                    case ',': {

                        sayac++;
                        if (sayac == 3) {
                            sayac = 0;
                            dene = dene.replace(",", " ");
                            dene.split(" ");

                        }
                    }
                    default:

                }
            }

            System.out.println(dene);

        }

    }
}