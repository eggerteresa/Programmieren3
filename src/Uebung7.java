import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Uebung7 {

    public static void main(String[] args) throws IOException {

//    aus google: javaschubla:
//    import java.io.*;
//
//pfad ausgeben von datei
        File f = new File ("test.txt");
        System.out.println("absoluter pfad " + f.getAbsolutePath());


                FileReader fr = new FileReader("test.txt");
                //geht auch so:
        // BufferedReader br = new BufferedReader(new FileReader("test.txt")); // kann dann aber fr nicht mehr verwenden

                BufferedReader br = new BufferedReader(fr); //wird als br behandelt

//                String zeile1 = br.readLine(); // kann nur br, fr nicht
//                System.out.println(zeile1);
//                String zeile2 = br.readLine();
//                System.out.println(zeile2);
//                String zeile3 = br.readLine();
//                System.out.println(zeile3);

                //alle zeilen ausgeben, ohne mehrere Befehle:


        String zeile = br.readLine();
        while (zeile != null){
            System.out.println(zeile);
            zeile = br.readLine();
        }
        //br.skip()
                br.close();
       // fr.close(); // müsste ich nicht mehr schließen. macht der br schon





    }
}
