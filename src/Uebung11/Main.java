package Uebung11;

import java.io.IOException;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("ue11 starting up... ");


        Productmanager productmanager = new Productmanager();
        Product p1 = new Product("Gouda",3.99, "Kaese" );
        Product p2 = new Product("Joghurt", 1.2, "Milchprodukte");

        //System.out.println(p1);

        productmanager.add(p1);
        productmanager.add(p2);

        productmanager.print();

        productmanager.saveToFile("uebung11.txt");

        productmanager.readFromFile("uebung11.txt");



    }
}
