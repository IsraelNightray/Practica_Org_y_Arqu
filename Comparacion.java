import java.io.*;
import java.util.Scanner;

public class Comparacion {
    BufferedReader lector = null;
    String linea=null;

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
    IOException e)
    {
        System.out.println(e);
    }finally
    {
        try {
            lector.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}}