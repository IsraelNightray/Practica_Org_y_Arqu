public interface Interface{


  /**
     * Permite saber cual computadora es mejor
     * @param banderaA la media que se va a aplicar
     * @param banderaB si se usa rendiimiento o tiempo que se va a aplicar
     * @param texto el texto que se va a leer
     */  
  public void daMejor(String banderaA, String banderaB, String texto);

  /**
   * Permite saber el mejor computador de la media geometrica
   */
  void daGeometrica();

  /**
   * Permite saber el mejor computador de la media ponderada 
   */
  void daPonderada();


}