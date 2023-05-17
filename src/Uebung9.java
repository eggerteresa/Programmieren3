import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Uebung9 {

    public static void main(String[] args) throws IOException{
//        FileWriter fileWriter = new FileWriter(f);
//        PrintWriter printWriter = new PrintWriter(fileWriter);

       File f = new File("Meinerstesvonjavaerstelltesfile.txt"); //hier erstelle ich nur das Objekt
     //  f.exists(); //überprüft vorher, ob es das schon gibt
       FileWriter fw = new FileWriter(f, true); // Ab hier existiert das File! mit append true schreibt es hinten dran, nicht über die datei

        PrintWriter pWriter = new PrintWriter(fw);

        pWriter.println("the third line");
        pWriter.println("the 4.line");

        pWriter.flush(); // übergibt text an datei
        pWriter.close(); // flushed automatisch, aber schöner code!





    }
}

