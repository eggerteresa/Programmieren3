import java.io.*;
import java.io.BufferedReader;

public class Uebung8 {

    public static void main(String[] args) throws IOException {




        InputStreamReader iSR = new InputStreamReader(System.in); //neu
        BufferedReader bR = new BufferedReader(iSR);


        String zeile = bR.readLine();


        while (zeile !=null) {
            if (zeile.toLowerCase().equals("stop")) {
                break;
            }
            System.out.println(zeile);
            zeile = bR.readLine();

        }

        bR.close();





    }
}
