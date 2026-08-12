/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aprobacionmateria;
import java.util.Scanner;
/**
 *
 * @author Ricardo Ortez
 */
public class AprobacionMateria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        String nomEstudiante = "a";
        double ingles = 0;
        double espaniol = 0;
        double promedio = 0;
        
        System.out.println("Ingrese el nombre del estudiante.");
        nomEstudiante = sc.next();
                
        System.out.println(nomEstudiante);
        
        
        System.out.println("Ingrese la calificacion del estudiante para la clase de ingles: ");
        ingles = sc.nextDouble();
        System.out.printf("Calificacion en clase de ingles: %.2f\n", ingles);
        
        System.out.println("Ingrese la calificacion del estudiante para la clase de espanniol: ");
        espaniol = sc.nextDouble();
        System.out.printf("Calificacion en clase de espanniol: %.2f\n", espaniol);   
        
        
        promedio = (ingles + espaniol) / 2.0; 
        
       if (promedio >= 65.0) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }       
           
           
           
       
        
    }
    
}
