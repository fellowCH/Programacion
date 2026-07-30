/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleccionvehiculo;

import java.util.Scanner;

/**
 *
 * @author Ricardo Ortez
 * 
 * 
 * 1. Estructura de seleccion
 *  a. Palabras Clave
 *  b. Bloques
 *  c. Terminaciones
 *  d. Condiciones
 * 
 * 2. Tipos de Seleccion
 *  a. Simple
 *  b. Doble
 * 
 * 3. Condiciones
 *  a. Tipos de Condiciones
 *  b. Tipos de Comparacion
 */
public class SeleccionVehiculo {

    /**
     * @param args the command line arguments
     * 
     * 
     * Desarrollar un algoritmo que permita determinar
     * los siguientes elementos de un vehiculo
     * 
     *      a. Si el tamanio del tanque de combustible agarra mas de 30 litros (Dato numerico).
     *      b. El tipo de combustible si es o no Diesel (Dato tipo caracter)
     *      c. Si energeticamente eficiente y ecologico. (Dato cadena)
     * 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Variables
        Scanner entrada = new Scanner(System.in);
        int cantidadLitros = 0;
        char respuestaTipo = 'a';
        String respuestaCadena = "John Doe";
        
        
        
        System.out.println("Me dijeron que eres duenio de un vehiculo \"Verde\"");
        System.out.println("Tienes que echarle biodiesel.");
        System.out.print("Cuantos litros de agarra \n");
        cantidadLitros = entrada.nextInt();
        
        if(cantidadLitros > 30) {
            
            System.out.println("Es un vehiculo con");
            System.out.println("grandes capacidades");
            System.out.println("Seguro la factura es alta.");
            
        } 
        
        System.out.println("");
       
        entrada.nextLine();
        System.out.println("Tu vehiculo es Diesvel Verde? (x = si, y = no)");
        respuestaTipo = entrada.nextLine().charAt(0);
        
        if (respuestaTipo == 'x') {
            
            System.out.println("Si es diesel verde");
            System.out.println("Diesel cominado con ethanol");
            System.out.println("Se saca del maiz");
            
        }
        else
        {
            
            System.out.println("Uy. sos anticlimatico");
            System.out.println("Calentamiento global...\n");
            
        }
        
        
        System.out.println("\nSeguro que es asi?");
        respuestaCadena = entrada.nextLine();
        System.out.printf("Respuesta ingresada> %s \n", respuestaCadena);
   /*     
        System.out.println("\nSeguro que es asi?");
        respuestaCadena = entrada.nextLine().toUpperCase();
        System.out.printf("Respuesta ingresada> %s", respuestaCadena);
        
        System.out.println("\nSeguro que es asi?");
        respuestaCadena = entrada.next().toLowerCase();
        System.out.printf("Respuesta ingresada> %s", respuestaCadena);  
    */
   
        if(respuestaCadena.equals("si")) {
            
            System.out.println("Excelente");
            System.out.println("Amigable con el amable");
        }  
        else 
        {
                    
             System.out.println("Uy. Busca que se puede hacer.");
                                            
        }
   
    }
    
}
