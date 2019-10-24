public class Ex16ptb4 {
  public static void main(String[] args) {
    String relleno = "*";
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el número de trozos: ");
    int trozos = -1;
    while (trozos < 0 || trozos > alturaIntroducida || (alturaIntroducida % trozos) < 0 || (alturaIntroducida % trozos) > 0) {
      trozos = Integer.parseInt(System.console().readLine());
      if (trozos < 0 || trozos > alturaIntroducida || (alturaIntroducida % trozos) < 0 || (alturaIntroducida % trozos) > 0) {
        System.out.print("No puede haber más trozos que pisos en la pirámide. También debe poder dividirse por su altura. Inténtalo de nuevo: ");
      }
    }      
    
    int planta = 1;
    int longitudDeLinea = 1;
    int espacios = alturaIntroducida-1;
    
    while (planta <= alturaIntroducida) {
      
      // inserta espacios
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la línea
      for (int i = 1; i <= longitudDeLinea; i++) {
        System.out.print(relleno);
      }
      System.out.println();

      planta++;
      espacios--;
      longitudDeLinea += 2;
    }
  }
}
