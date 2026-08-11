/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclorepeticionfor;

import java.util.Scanner;

/**
 *
 * @author Ricardo Ortez
 * 
 * Objetivos
 * 1. Implementar ciclo de repeticion FOR
 * 2. Uso de CONSTANTES
 * 
 * 
 * 
 */
public class CicloRepeticionFOR {

    /**
     * Se quiere contabilizar la cantidad de minutas
     * que se entregan a los ninos y ninas en una fuesta.
     * Con ello sacar el porcentaje de cuantos fueron ninos y ninas
     * 
     * 
     * 
     */
    public static void main(String[] args) {
        
        /*
            1. Variable control -> Valor Inicial
            2. Condicion -> Limite
            3. Modificador -> Incremento / Decremento
        */
        
        for(int i = 0 ; i < 10 ; i++){
            System.out.printf("Valor: %d\n", i);
        }
        
        System.out.println("");
        System.out.println("Segundo Ciclo FOR");
        for (int i = 2; i < 10; i += 2){
            
            System.out.printf("Valor: %d\n", i);
        }
        
        
        //Declaracion de Variables
        Scanner sc = new Scanner (System.in);
        int numVarones = 0;
        int numMujeres = 0;
        char seleccion = 'a';
        final int TOTAL = 10; //final int funcion para declarar que esa variable se mantiene con ese valor SIEMPRE.
        double porcentaje = 0;
        
            for (int i = 0; i < TOTAL; i++) {
                System.out.printf("%d)Quien viene por una minuta?\n", i+1);
                System.out.println("V: Varon / M: Mujer");
                System.out.print("Respuesta: ");
                seleccion = sc.next().toUpperCase().charAt(0);


                switch (seleccion) {
                    case 'V':
                        System.out.println("Varon comiendo minuta");
                        numVarones++;
                        break;

                    case 'M':
                        System.out.println("Mujer comiendo minuta");
                        numMujeres++;
                        break;

                    default:
                        System.out.println("Selección inválida. Intente de nuevo.");                        
                        break;
                   } // Fin de SWITCH
             } // Fin de FOR
        
            
            System.out.println("");
            porcentaje = (double)numVarones / TOTAL;
            System.out.printf("Porcentaje: %.2f\n", porcentaje);
        
            System.out.println("Porcentaje de mujeres");
            porcentaje = (double)numMujeres / TOTAL;
            System.out.printf("Porcentaje: %.2f\n", porcentaje);
            
    } // Fin del Main
    
} // Fin de Class
