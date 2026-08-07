/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentarestaurante;
import java.util.Scanner;
/**
 *
 * @author Ricardo Ortez
 */
public class CuentaRestaurante {
    
    /**
     * @param args the command line arguments
     * 
     * OBJETIVO
     *  1. Conocer las diferentes tipos de ciclo de repeticion
     *  2. Analizar los componentes de todo ciclo de repeticion
     *  3. Construir un algoritmo de un ciclo de repeteicion
     * 
     * 
     * Desarrollar un algoritmo que simule la cuenta de un restaurante
     * que se tiene que pagar entre un grupo de amigos (7) dividido en 
     * partes iguales
     * 
     * 
     * ciclos de repeticion:
     *  1. While
     *  2. Do - While
     *  3. For
     *  4. For each
     * 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        double promedioPago = 0;
        int gastoIndividual = 0;
        
        int numPersona = 1;
        int gastoAcumulado = 0;
        //Condicion
        while(numPersona <= 7){
        //Instrucciones a Repetir
            System.out.printf("Persona %d) Cuanto te hartaste?", numPersona);
            gastoIndividual = sc.nextInt();
            
            gastoAcumulado += gastoIndividual;
            System.out.printf("P: %d\tGasto Ind: %d\tGasto ACUM: %d", numPersona, gastoIndividual, gastoAcumulado);
            System.out.println("");
            //Modificador
            //Opcion #1                    
            //numPersona += 1; o numPersona = numPersona + 1;
            
            //Opcion #2
            numPersona++; //POST Incremento Unitario
            
        } // Fin del while
        numPersona--; //POST Decremento Unitario
        System.out.printf("Total acumulado: %d", numPersona);
        promedioPago = gastoAcumulado / numPersona;
        
        System.out.printf("\nGasto Promedio x persona: %.2f", promedioPago);
        
    } // Fin del main
    
}   // Fin del class
