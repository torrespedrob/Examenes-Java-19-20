public class Ex16ptb3 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    long recortado = numeroIntroducido;
    /*Simplemente coge el primer numero del numero introducido y lo usa
    para cortar esa posicion, pero el programa no parece coger el primer
    numero, siempre es 0*/
    while (recortado > 0) {
      recortado/=10;
      
    }
    long posicion = recortado;

    long numero = numeroIntroducido;

    // calcula la longitud del número
    int longitud = 0;
    
    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);
    
    // parte izquierda
    long parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));
    
    // parte derecha
    long parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion + 1));

    System.out.print("Los números partidos son el " + parteIzquierda + " y  el " + parteDerecha + ".");
  }
}
