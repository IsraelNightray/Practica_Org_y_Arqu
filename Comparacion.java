import java.io.*;
import java.util.ArrayList;

//**Clase de comparacion de computadoras por medio de sus pruebas*/
public class Comparacion implements Interface {

    //Lector del txt
    BufferedReader lector = null;

    //Linea actual que se esta leyendo (Auxiliar)
    String lineaActual = "";

    //Se guarda en cada posicion numero de computadoras a comparar y numero de resultados
    ArrayList<Double> filaUno = new ArrayList<Double>();

    //Numero de pesos
    ArrayList<Double> filaDos = new ArrayList<Double>();

    //Lista de cada renglon de resultados 
    ArrayList<ArrayList<Double>> filaTres = new ArrayList<ArrayList<Double>>();
    
    //Ayuda a leer y pasar los resultados a las listas (Aun no esta hecho)
    private void leer(){
        try
        {
            lector = new BufferedReader(new FileReader("resultados.txt"));
            do {
                lineaActual = lector.readLine();
                System.out.println(lineaActual + "\n");
                System.out.println();
            } while (lineaActual != null);
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

    public void daMejor(String banderaA, String texto){

    }

    public void daGeometrica(){

    }

    public void daPonderada(){

    }

}