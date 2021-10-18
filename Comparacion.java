import java.io.*;
import java.util.ArrayList;

public class Comparacion {
    public static void main(String[] args) {

        // Valores del texto
        ArrayList<String[]> valores = new ArrayList<String[]>();

        if (args.length > 0) {

            // El primer argumento lo guarda(que sería el calculo)
            String calculo = new String();
            calculo = args[0];

            // Guarda segundo argumento (que sería el nombre del texto)
            String medida = new String();
            medida = args[1];

            String texto = new String();
            texto = args[2];

            // Buffer lector
            BufferedReader lector = null;
            String linea = null;

            ArrayList<Double> mediasPonderadas = new ArrayList<Double>();
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
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    lector.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println(calculo);
            switch (calculo) {

                case "-g":
                    System.out.println("Aquí haríamos la geo");
                    break;

                case "-p":

                    Double ponderada = 0.0;
                    Double pesosSumados = 0.0;
                    for (int k = 0; k < valores.get(1).length; k++) {
                        pesosSumados = pesosSumados + Double.parseDouble(valores.get(1)[k]);
                    }
                    // Calcula las medias ponderadas de cada computadora y las guarda en una lista
                    for (int j = 2; j < valores.size(); j++) {
                        for (int i = 0; i < valores.get(2).length; i++) {
                            ponderada += (Double.parseDouble(valores.get(1)[i])
                                    * Double.parseDouble(valores.get(j)[i]));
                        }
                        mediasPonderadas.add(ponderada / pesosSumados);
                        ponderada = 0.0;
                    }
                    // Busca max y min en la lista generada anteriormente
                    Double max = 0.0;
                    Double min = 0.0;
                    for (Double media : mediasPonderadas) {
                        if (media > max) {
                            max = media;
                        }
                    }
                    min = max;
                    for (Double media : mediasPonderadas) {
                        if (media < min) {
                            min = media;
                        }
                    }
                    //Dependiendo de la bandera, regresa la PC 
                    if (medida.equals("-t")) {
                        System.out.println("PC" + mediasPonderadas.indexOf(min));
                    } else if (medida.equals("-r")) {
                        System.out.println("PC" + mediasPonderadas.indexOf(max));
                    }
                    break;

                default:
                    System.out.println("No se ingreso una bandera valida ):");

            }

        } else {
            System.out.println("No se dieron argumentos para trabajar");
        } // Fin de lectura.

    }
}