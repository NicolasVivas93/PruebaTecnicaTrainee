
package com.clinica.mavenproject3;

import java.util.Arrays;
import java.util.Scanner;


public class Mavenproject3 {

    public static void main(String[] args) {
        
        // Cargar mapa de filas y asientos
        char anfiteatro[][] = new char[10][10];
        
        for (int fila = 0; fila < 10; fila++) {
            for (int asiento = 0; asiento < 10; asiento++) {
                anfiteatro[fila][asiento] = 'L';
            }
        }
        
        String salida;
        String verAsientos;
        Scanner teclado = new Scanner(System.in);
        
        do {           
            System.out.println("Bienvenido al sistema de reservas");
            System.out.println("-----------------------------------");
            
            System.out.println("Desea ver mapa de asientos? (S para Sí / N para No): ");
            verAsientos = teclado.next();
            
            if (verAsientos.equalsIgnoreCase("S")) {                
            // Imprimir/Mostrar mapa de asientos para que el usuario elija
                for (int fila = 0; fila < 10; fila++) {
                    for (int asiento = 0; asiento < 10; asiento++) {
                        System.out.print(anfiteatro[fila][asiento] + " ");              
                    }
                System.out.println("");
                }                
            }                 
            
            System.out.println("");
            System.out.println("Ingrese fila: ");
            int filaSelec = teclado.nextInt();
        
            System.out.println("Ingrese asiento: ");
            int asientoSelec = teclado.nextInt();
            
            if(filaSelec > 10 || asientoSelec > 10) {
                System.out.println("Asientos inexistentes. Seleccione dentro del rango");              
            } else {
                // Revisar si asiento está ocupado o no
                if (anfiteatro[filaSelec-1][asientoSelec-1] == 'L') {
                    anfiteatro[filaSelec-1][asientoSelec-1] = 'X';
                    System.out.println("Asiento reservado con éxito");
                } else {
                    System.out.println("Asiento ocupado. Seleccione otro asiento");
                }
            }
            System.out.println("Desea continuar? (S/N): ");
            salida =  teclado.next();                  
        } 
        while (salida.equalsIgnoreCase("s"));   
    }
}         
        
