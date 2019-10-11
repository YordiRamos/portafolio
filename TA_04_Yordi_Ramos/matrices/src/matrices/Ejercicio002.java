/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;
import java.util.Scanner;
/**
 *
 * @author Añapa
 */
public class Ejercicio002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] num = new int[4][5]; // array de 4 filas por 5 columnas
    
        int fila;
        int columna;

        // Lee los datos de teclado
        System.out.println("\nPor favor, introduzca los números (enteros) en el array\n");
        for(fila = 0; fila < 4; fila++) {
          for(columna = 0; columna < 5; columna++) {
            
            
            
            
            num[fila][columna] = Integer.SIZE;
          }
        }

        // Muestra los datos y las sumas parciales de las filas
        int sumaFila;
        for(fila = 0; fila < 4; fila++) {
          sumaFila = 0;
          for(columna = 0; columna < 5; columna++) {
            System.out.printf("%7d   ", num[fila][columna]);
            sumaFila += num[fila][columna];
          }
          System.out.printf("|%7d\n", sumaFila);
        }

        // Muestra las sumas parciales de las columnas
        for(columna = 0; columna < 5; columna++) {
          System.out.print("----------");
        }
        System.out.println("-----------");

        int sumaColumna;
        int sumaTotal = 0;
        for(columna = 0; columna < 5; columna++) {
          sumaColumna = 0;
          for(fila = 0; fila < 4; fila++) {
            sumaColumna += num[fila][columna];
          }

          sumaTotal += sumaColumna;
          System.out.printf("%7d   ", sumaColumna);
        }
        System.out.printf("|%7d   ", sumaTotal);
      }
        // TODO code application logic here
    
    }


