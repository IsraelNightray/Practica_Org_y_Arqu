import java.io.*;
import java.util.ArrayList;

public class Comparacion {
    public static void main(String[] args) {

        // Valores del texto
        ArrayList<String[]> valores = new ArrayList<String[]>();

        if (args.length > 0) {

            // El primer argumento lo guarda(que sería la bandera)
            String bandera = new String();
            bandera = args[0];

            // Guarda segundo argumento (que sería el nombre del texto)
            String texto = new String();
            texto = args[1];

            // Buffer lector
            BufferedReader lector = null;
            String linea = null;

            // Lectura del texto
            try {
                lector = new BufferedReader(new FileReader(texto));
                do {
                    linea = lector.readLine();
                    if (linea != null) {
                        valores.add(linea.split(" "));
                    }
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

            switch (bandera) {

                case "-g":
                    break;

                case "-p":
                    break;

                case "-r":
                    break;

                case "-t":
                    break;

                default:
                    System.out.println("No se ingreso una bandera valida ):");

            }

        } else {
            System.out.println("No se dieron argumentos para trabajar");
        } // Fin de lectura.

    }
}