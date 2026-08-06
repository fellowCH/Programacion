/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiemporelax;

import java.util.Scanner;

/**
 *
 * @author Ricardo Ortez
 * 
 * 
 * Objetivos 
 *  1. Seleccion Multiples
 *      a. Estructura
 *      b. Tipos de Condicion
 * 
 *  2. Formateo de cadenas (printf)
 *      
 * 
 * 
 */
public class TiempoRelax {

    /**
     * @param args the command line arguments
     * 
     * Desarrollar algoritmo que me permita escoger un pais a visitar.
     * Posterior a ello, debemos nosotros escoger las posibles ciudades
     * a recorrer, sin embargo, solo se puede una cioudad.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int seleccionMenu = 0;
        char seleccionSubMenu = 'a';
        
        System.out.println("Agencia de Viajes");
        System.out.printf("|%20s| |%-20s| \n", "Tania's Travel", "Buen Viaje");
        System.out.println("-------------------------------------------------");
        System.out.println("1. Japon");
        System.out.println("2. Francia");
        System.out.println("3. Nueva Zelanda");
        System.out.println("4. Canada");
        System.out.println("Respuesta: ");
        seleccionMenu = sc.nextInt();
        
        switch (seleccionMenu) {
            
            case 1:
                System.out.println("Konichiwa extranjero.");
                System.out.println("--------------------");
                System.out.println("Escogue una ciudad mediante su letra");
                System.out.println("A. Osaka");
                System.out.println("B. Tokio");
                System.out.println("C. Kioto");
                System.out.println("Respuesta:");
                
                sc.nextLine(); //Limpiando buffer.
                seleccionSubMenu = sc.nextLine().toUpperCase().charAt(0);
                
                switch (seleccionSubMenu){
                    
                    case 'A':
                            System.out.println("Super Nintendo World Tour");
                        break;
                    
                    case 'B':
                            System.out.println("Car Meet");
                        break;
                        
                        
                    case 'C':
                            System.out.println("Buena pregunta, no se.");
                        break;
                        
                    default:
                            System.out.println("Cualquier ciudad");
                            System.out.println("Ya que no ni una opcion");
                            System.out.println("de las que escogiste");
                        break;
                        
                } // Fin de SwitchSubMenu       
                
                break;
            
            case 2:
                System.out.println("Bonjour extranjero.");
                System.out.println("---------------------");
                System.out.println("Escogue una ciudad mediante su numero");
                System.out.println("1. Paris");
                System.out.println("2. Marseille");
                System.out.println("3. Lyon");
                System.out.println("Respuesta: ");
                
                sc.nextLine();
                seleccionSubMenu = sc.nextLine().charAt(0);
                
                switch (seleccionSubMenu){
                    
                    case '1':
                            System.out.println("Torre Eiffel");
                        break;
                    
                    case '2':
                            System.out.println("Palacio de Maseille");
                        break;
                        
                        
                    case '3':
                            System.out.println("Un estadio.");
                        break;
                        
                    default:
                            System.out.println("No esta la opcion brochacho...");                                             
                break;
                }
            case 3:
                System.out.println("*en nueva zelandes* bienvenido extranjero.");
                System.out.println("---------------------");
                
                System.out.println("A. Sky Tower");
                System.out.println("B. Hogbbiton");
                System.out.println("C. Mildford Sound");
                System.out.println("Respuesa: ");
                
                sc.nextLine();
                seleccionSubMenu = sc.nextLine().toUpperCase().charAt(0);
                
                if(seleccionSubMenu == 'A'){
                    System.out.printf("%s Sky Tower %s","\u001B[31m","\u001B[0m");
                    
                }else if(seleccionSubMenu =='B'){
                    System.out.printf("%s Hogbbiton %s","\u001B[32m","\u001B[0m");
                    
                }else if(seleccionSubMenu =='C'){
                    System.out.printf("%s Mildford Sound %s","\u001B[34m","\u001B[0m");
                }
                else{
                    System.out.println("Usted no lee va?!!!");
                }  
                break;
                
            case 4: 
                System.out.println("Welcome to canada extranjero.");
                
             
                
                break;
        }//Fin del switch Menu
        
    } // Fin del main
    
} // Fin de class
