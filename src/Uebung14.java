import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;

public class Uebung14 {
    public static void main(String[] args) throws IOException {

        File file = new File("test-output.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        String outputText = "hello File - first Output";

        for (char c : outputText.toCharArray()) {

            System.out.println("Schreibe char " + (int) c + " in die Datei... "); // mit int - downcasten - zeigt uns den Code an; in Datei wird der ASCII Code eingegeben, aber schon übersetzt
            fileOutputStream.write(c);
        }




        fileOutputStream.flush();
        fileOutputStream.close();



    }
}
