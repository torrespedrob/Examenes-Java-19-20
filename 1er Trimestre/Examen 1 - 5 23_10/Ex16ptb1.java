public class Ex16ptb1 {
  public static void main(String[] args) {
    //EL POLITO BONITO por Pedro Torres Barba
    //Declaracion de variables
    int unidades;
    double precioUnidad = 0;
    int estilo;
    double totalTextil = 0;
    int tecnica;
    double costeTecnica = 0;
    double totalTecnica = 0;
    double poloMasLogotipo;
    double iva = 0.21;
    double totalFinal;
    
    //Entrada de datos
    System.out.print("Introduzca la cantidad de polos que desea: ");
    unidades = Integer.parseInt(System.console().readLine());
    System.out.print("Seleccione el estilo 1 (blanco) 2 (color): ");
    estilo = Integer.parseInt(System.console().readLine());
    //Si es blanco
    if (estilo == 1 & unidades >= 20 && unidades <= 39) {
      precioUnidad = 4.90;
    } else if (estilo == 1 && unidades >= 40 && unidades <= 99) {
      precioUnidad = 3.90;
    } else if (estilo == 1 && unidades >= 100) {
      precioUnidad = 3.20;
    }
    //Si es de color
    if (estilo == 2 && unidades >= 20 && unidades <= 39) {
      precioUnidad = 5.88;
    } else if (estilo == 2 && unidades >= 40 && unidades <= 99) {
      precioUnidad = 4.68;
    } else if (estilo == 2 && unidades >= 100) {
      precioUnidad = 3.84;
    }
    System.out.print("Seleccione la tecnica 1 (serigrafia) 2 (bordado): ");
    tecnica = Integer.parseInt(System.console().readLine());
    //Para serigrafia
    if (tecnica == 1 && unidades < 50) {
      costeTecnica = 2;
    } else if (tecnica == 1 && unidades >= 50) {
      costeTecnica = 1.50;
    }
    //Para bordado
    if (tecnica == 2 && unidades < 50) {
      costeTecnica = 3;
    } else if (tecnica == 2 && unidades >= 50) {
      costeTecnica = 2.50;
    }
    
    //Salida formateada
    System.out.println("");
    System.out.println("EL POLITO BONITO - PRESUPUESTO\n");
    System.out.println("");
    System.out.printf("%20s %10d", "Cantidad de polos (ud.)", unidades);
    System.out.printf("\n%20s %16.2f", "Precio unitario", precioUnidad);
    totalTextil = unidades * precioUnidad;
    System.out.printf("\n%20s %16.2f", "Total textil", totalTextil);
    //Diferencia entre serigrafia y bordado
    totalTecnica = costeTecnica * unidades;
    if (tecnica == 1) {
      System.out.printf("\n%20s %16.2f", "Serigrafia (c.u.)", costeTecnica);
      System.out.printf("\n%20s %16.2f", "Total Serigrafia", totalTecnica);
    } else if (tecnica == 2) {
      System.out.printf("\n%20s %16.2f", "Bordado (c.u.)", costeTecnica);
      System.out.printf("\n%20s %16.2f", "Total Bordado", totalTecnica);
    }
    poloMasLogotipo = totalTextil + totalTecnica;
    System.out.printf("\n%20s %16.2f", "Polo mas logotipo", poloMasLogotipo);
    System.out.printf("\n%20s %16.2f", "IVA", poloMasLogotipo*iva);
    totalFinal = (poloMasLogotipo*iva) + poloMasLogotipo;
    System.out.printf("\n%20s %16.2f", "TOTAL", totalFinal);
    
  }
}
