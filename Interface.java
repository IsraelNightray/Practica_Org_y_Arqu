public interface Interface{


  /**
     * Permite saber cual computadora es mejor
     * @param bandera la media que se va a aplicar
     * @param texto el texto que se va a leer
     */  
  public void daMejor(String bandera, String texto);

  /**
   * Permite saber el mejor computador de la media geometrica
   */
  void daGeometrica();

  /**
   * Permite saber el mejor computador de la media ponderada 
   */
  void daPonderada();


}