package codigoOtros6;

import java.util.Scanner;

/*
 * Evaluación: 
 * Rene Gomez Orozco: 5/5
 * Paulina Mendoza Bernal: 5/5
 * */

public class Codigo6 {
	  public static void main(String[] args) {
    int n[] = new int[20]; //Se corrigió la declaración e inicialización del array

    for (int i = 0; i < 20; i++) { //Se corrigió el operador de incremento
      n[i] = (int)(Math.random() * 381) + 20;
      System.out.print(n[i] + " "); //Se asignó un out al método print
    }
    
    System.out.println("\n¿Qué números quiere resaltar? "); //Se corrigió la escritura del método println
    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    //Se optó por usar un escaner para evitar el error que generaba el System.console, ya que el IDE no tiene una consola asociada
    Scanner scanner = new Scanner(System.in);
    int opcion = scanner.nextInt();   
    //int opcion = Integer.parseInt(System.console().readLine());
    scanner.close();
    int multiplo = (opcion == 1) ? 5 : 7; //Se corrigió el operador ternario
    //char e;
    for ( int e : n) { //se cambió el tipo de dato de e para coincidir con el tipo de datos de n
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");
      }
       else {
        System.out.print(e + " "); //Se cambió a un out para que se imprima en consola
      }
    }
}
}