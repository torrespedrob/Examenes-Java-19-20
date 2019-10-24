public class Ex16ptb2 {
  public static void main(String[] args) {
    //EL POLITO BONITO con control por Pedro Torres Barba
    //Declaracion de variables
    int unidades = 0;
    double precioUnidad = 0;
    int estilo = 0;
    double totalTextil = 0;
    int tecnica = 0;
    double costeTecnica = 0;
    double totalTecnica = 0;
    double poloMasLogotipo;
    double iva = 0.21;
    double totalFinal;
    
    //Entrada de datos
    System.out.print("Introduzca la cantidad de polos que desea: ");
    //Comprueba la cantidad minima de polos
    while (unidades < 20) {
      unidades = Integer.parseInt(System.console().readLine());
      if (unidades < 20) {
        System.out.print("Error, debe haber 20 unidades como minimo, intentelo de nuevo: ");
      }
    }
    System.out.print("Seleccione el estilo 1 (blanco) 2 (color): ");
    //Comprueba que el estilo sea valido
    while (estilo < 1 || estilo > 2) {
      estilo = Integer.parseInt(System.console().readLine());
      if (estilo < 1 || estilo > 2) {
        System.out.print("Error, debes introducir un estilo (1 o 2): ");
      }
    }
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
    //Comprueba que la tecnica sea valida
    while (tecnica < 1 || tecnica > 2) {
      tecnica = Integer.parseInt(System.console().readLine());
      if (tecnica < 1 || tecnica > 2) {
        System.out.print("Error, debes introducir una tecnica valida (1 o 2): ");
      }
    }
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
