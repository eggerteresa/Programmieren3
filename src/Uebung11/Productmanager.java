package Uebung11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Productmanager {


    private List<Product> productList = new ArrayList<>(); //private Liste erstellen, private weil ich nich will, dass jemand von außen etwas daran verändert

    public void add(Product p) {
        productList.add(p);


    }


    public void print()  {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }


    public void saveToFile (String path) throws IOException { // Exception kommt zur Methode
        File f = new File(path); //hier erstelle ich nur das Objekt - zeigt den Pfad

        FileWriter fw = new FileWriter(f, true); // Ab hier existiert das File! mit append true schreibt es hinten dran, nicht über die datei
//um den Pfad filewriter herum
        BufferedWriter bw = new BufferedWriter(fw);


        //Alle Produkte auf Konsole ausgeben
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i)); //unsere Print-Methode
            System.out.println(" Productmanageer funktioniert");
            bw.write(productList.get(i).toString());
            bw.newLine();

        }
        System.out.println("flushing..");
        bw.flush();
        System.out.println("close bw");
        bw.close();


    }




    public void readFromFile(String path) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr); //wird als br behandelt

        String zeile = br.readLine();
        while (zeile != null){
            System.out.println(zeile);

           zeile = br.readLine();
        }

        br.close();


    }


}
