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
public class Ejercicio003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        
        
        System.out.print("\nIntroduzca la posición del alfil, por ejemplo d5: ");
        
        String posicionAlfil = leer.next();
        
        
        
        int columnaAlfil = (int)(posicionAlfil.charAt(0)) - 96;
        int filaAlfil = (int)(posicionAlfil.charAt(1)) - 48;

        System.out.println("El alfil puede moverse a las siguientes posiciones:");

        for(int fila = 8; fila >= 1; fila--) {
          for(int columna = 1; columna <= 8; columna++) {
            if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna))
                  && (! ((filaAlfil == fila) && (columnaAlfil == columna)))) {
              System.out.print((char)(columna + 96) + "" + fila + " ");
            }
          }
        }
      }
    }    

        
    

