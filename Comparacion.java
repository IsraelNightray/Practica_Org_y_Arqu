import java.io.*;
import java.util.Scanner;

public class Comparacion {
    public static void main(String[] args) {
        if (args.length > 0) {
            //El primer argumento lo guarda(que sería la bandera)
            String bandera=new String();
            bandera= args[0];
            //Guarda segundo argumento (que sería el nombre del texto)
            String texto= new String();
            texto= args[1];
            BufferedReader lector = null;
            String linea = null;
            
            try {
                lector = new BufferedReader(new FileReader(texto));
                do {
                    linea = lector.readLine();
                    System.out.println(linea + "\n");
                } while (linea != null);
            } catch (FileNotFoundException e) {
                System.out.println(e);
            } catch (IOException e) {
                System.out.println(e);
            } finally {
                try {
                    lector.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        } else {
            System.out.println("No se dieron argumentos para trabajar");
        }
        
    }
}