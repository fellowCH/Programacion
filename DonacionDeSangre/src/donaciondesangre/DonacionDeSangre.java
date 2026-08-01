/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donaciondesangre;

import java.util.Scanner;

/**
 *
 * @author Ricardo Ortez
 */
public class DonacionDeSangre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner entrada = new Scanner(System.in);
      
//Variables que se usaran.    
        int edad = 0;
        int peso = 0;
        char comio = 'a';
        int niveles = 0;
        String genero = "HM";
        
//Ingresar datos.        
        System.out.println("Ingrese la edad.");       
        edad = entrada.nextInt();
        
        System.out.println("Ingrese el peso.");
        peso = entrada.nextInt();
        
//Verificacion de peso y edad mediante IFs.
        if(edad >= 18 && edad <= 65 && peso >= 110){      //Uso de AND.    
            
            entrada.nextLine(); //Limpiar buffer
            
            System.out.println("Comio?");
            comio = entrada.nextLine().charAt(0);
            
            
            if (comio == 'S' || comio == 's'){
                System.out.println("Si puede donar");
                
            }
            else 
            {
                System.out.println("Vaya coma plis.");
            }
            
            
        }
        
        else
            
        {
            System.out.println("No puede donar");
            
        }
        
        entrada.nextLine();
        System.out.println("Ingrese sus niveles de hierro");
        niveles = entrada.nextInt();
        
        entrada.nextLine();
        System.out.println("Es usted hombre o mujer?");
        genero = entrada.nextLine().toUpperCase();
        
        if ((niveles >= 14 && genero.equals("MASCULINO")) || 
            (niveles >= 12 && genero.equals("FEMENINO"))) {
    
            System.out.println("Si puede donar.");
    
        } else {
    
            System.out.println("No puedes donar sangre.");
    
        }
           
        
    } //Fin de main
    
} //Fin class
