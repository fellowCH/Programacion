/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usolibreriamath;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author Ricardo Ortez
 */
public class UsoLibreriaMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculadora de Circulos");
        System.out.println("Por favor, escribe el radio del circulo:");
        
        double radio = sc.nextDouble();
        

        double area = Math.PI * Math.pow(radio, 2);
        
        double circunferencia = 2 * Math.PI * radio;
        

        System.out.println("\nResultados");
        

        System.out.printf("El area del circulo es: %.2f\n", area);
        System.out.printf("La circunferencia del circulo es: %.2f\n", circunferencia);
        
        
    }
    
}
