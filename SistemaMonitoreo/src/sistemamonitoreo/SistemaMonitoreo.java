package sistemamonitoreo;

import java.util.Random;
import java.util.Scanner;


public class SistemaMonitoreo {

    
    /* Lista de Tarea
    
            1. Entradas
                Nombre de Usuario
                Nombre de Lecturas
                Ingreso de Temperatura (RANDOM)
                
            2. Calculos
                Formula Celsius - Farenheit 
                Definicion de Sobrecalentamiento
                Validacion de Lecturas (0> temp <50)
                Contabilizar el numero calentamiento
                Promediar el monitoreo
                -Validacion Temperatura
    
    
            3. Salida
                Resumen Estadistico
                Alterta de Sobrecalentamiento
    
            Lista de Tareas
                Capturar nombre del usuario
                    definicion de libreria SCANNER
                    declaracion de variable para el usuario
                Captura de numero de lecturas
                    delcaracion de variable para el numero de lectura
                Generacion de temperatura
                    definir la libreria RANDOM
                    declaracion de variable
                    mostrar el numero random generado temporalmente
                    rango de temp 200-400
    
            4. Formula: F = (C * 9/5)+32
            5. Limite de sobrecalentamiento 350 C (662 F)
            6. Validacion de lecturas (DO WHILE)
            7. Sumar los numeros de sobrecalentamiento
            8. Calcular el promedio
            9. Mostrar el resumen
                Promedio
                # de sobrecalentamiento
            10. Generar una alerta de sobrecalentamiento 
    
    */

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        
        String nombreUsuario = "a";
        int numLectura = 0;
        int ciclo = 0;
        double tempC = 0;
        double tempF = 0;
        int numSobreCalentamiento = 0;
        double promedio = 0;
        double acumTEMP = 0;
        
        System.out.println("Nombre de Operacion: ");
        nombreUsuario = sc.nextLine().toUpperCase();
        System.out.printf("Validar Captura: %s\n", nombreUsuario);
        
        do{
            
        System.out.println("Numero de Operacion: ");
        numLectura = sc.nextInt();
        //System.out.printf("Validar Captura: %d\n", numLectura);
        
        if(!(numLectura > 0 && numLectura < 50)){
            
            System.out.println("VALOR INVALIDO");
            System.out.println("Tiene que ser entre 0 y 50");
            
        }
        
        
        } while(!(numLectura > 0 && numLectura < 50));{
        
        
        
        }
        
        

        
        System.out.printf("Validacion random: %.2f\n", tempC);
        
        while(ciclo < numLectura){
            
            tempC = rd.nextDouble(200,400);
            tempF = (tempC * 9/5) + 32;        
            
            System.out.printf("Num lec: %d\t Temp C: %.2f", ciclo+1, tempC);
            System.out.printf("Temp en faren: %.2f \n", tempF);
            
            
            
            if(tempF > 662){
                
                System.out.println("TE VAS A SOBRECALENTAR");
                numSobreCalentamiento++;
                
            } else{
                
                acumTEMP += tempF;
                
            }
            
            ciclo++;
            
        } // Fin del WHILE
        
        promedio = acumTEMP / numLectura;
        System.out.println("-------------------");
        System.out.println("      RESUMEN     ");
        System.out.println("-------------------");
        System.out.println("");
        System.out.printf("Promedio de TEMP: %.2f\n", promedio);
        System.out.printf("SOBRECALENTAMIENTO: %d", numSobreCalentamiento);
        
    } // Fin del MAIN
    
} // Fin del CLASS
