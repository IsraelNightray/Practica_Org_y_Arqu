import java.io.*;

public class Comparacion {
    BufferedReader lector = null;
    String linea = null;

    public void leer(){
        try
        {
            lector = new BufferedReader(new FileReader("resultados.txt"));
            do {
                linea = lector.readLine();
                System.out.println(linea + "\n");
                System.out.println();
            } while (linea != null);
        }catch(
        FileNotFoundException e)
        {
            System.out.println(e);
        }catch(
        IOException i)
        {
            System.out.println(i);
        }finally
        {
            try {
                lector.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

}