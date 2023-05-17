import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Uebung15 {
    public static void main(String[] args) throws IOException {

        File file = new File("binaeroutput.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        char c = (char) System.in.read(); // liest ein byte! kann man auf beliebige Datei anwenden.
        while (c != 'x') {
            fileOutputStream.write(c);
            System.out.println("Zeichen geschrieben: " + (int) c);
            c = (char) System.in.read();
        }

        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("fertig");


    }


}

