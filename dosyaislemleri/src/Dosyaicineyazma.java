import java.io.FileWriter;

public class Dosyaicineyazma {
    public static void main(String[] args) {

        String excelveri = "deneme verileri falan filan";
        String rojin = "iyi dinle";
        try {

            FileWriter daktilo = new FileWriter("src/output.csv");
            daktilo.write(rojin + "\n");
            daktilo.write(excelveri);

            System.out.println("data dosya içine kaydedildi.");
            daktilo.close();

        } catch (Exception e) {

            e.getStackTrace();
        }
    }
}
