import java.io.*;

public class Uebung13 {


        public static void main(String[] args) throws IOException, FileNotFoundException {

            File file = new File("bild.bmp"); //oder text.txt oder welche datei ich anschauen möchte
            // FileInputStream stellt eine Verbindung zur Datei her. Datei wird geöffnet.

            FileInputStream fileInputStream = new FileInputStream(file);

            // Für Optimierung der Performance -> BufferedInputStream
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            // read() liefert Byte for Byte aus der Datei. Wenn das Ende erreicht ist, dann liefert die Methode -1 als Ergebnis.

            // While-Schleife liest somit Zeichen um Zeichen aus.


            int byteRead; //hat nur 1 Byte platz!
            int count = 0;
            while ((byteRead = bufferedInputStream.read()) != -1) {
                // char[] ch = Character.toChars(byteRead);
                // System.out.println(ch);
                // Byte wird in char umgewandelt und ausgegeben.
                System.out.print("Byte " + count + ": ");
                System.out.println((int) (byteRead)); //char für texte
               // System.out.println(" " + (char) byteRead + " "); für textdateien

                count = count +1; // durch die methode geht er jeweils einen character durch

            }
            System.out.println("Anzahl der Zeichen gesamt " + count);

            // close() gibt die Datei wieder frei.
            bufferedInputStream.close();



        }
    }


