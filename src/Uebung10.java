import java.io.*;

public class Uebung10 {

    public static void main(String[] args) throws IOException {
        //einlesen
        InputStreamReader iSR = new InputStreamReader(System.in); //neu
        BufferedReader bR = new BufferedReader(iSR);

        //schreiben auf file
        File f = new File("uebung10.txt"); //hier erstelle ich nur das Objekt
        //  f.exists(); //überprüft vorher, ob es das schon gibt
        FileWriter fw = new FileWriter(f, true); // Ab hier existiert das File! mit append true schreibt es hinten dran, nicht über die datei
        PrintWriter pWriter = new PrintWriter(fw);

        String zeile = bR.readLine();


        while (zeile !=null) {
            if (zeile.toUpperCase().equals("STOP")) {
                break;
            }
            System.out.println(zeile); // kann man auch weglassen, dann wiederholt er nicht, was wir schreiben
            pWriter.println(zeile);
            pWriter.flush(); // übergibt text an datei
             zeile = bR.readLine();

        }

        pWriter.close(); // flushed automatisch, aber schöner code!

        bR.close();










    }
}
