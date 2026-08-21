package trayectoriabalistica;
import java.util.Scanner;

public class TrayectoriaBalistica {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double v0 = 0;
        double angulo = 0;
        boolean datosValidos = false;
        
        System.out.println("Simulacion de Trayectoria Balistica");
        

        do {
            System.out.print("Ingrese la velocidad inicial (mayor a 0 m/s): ");
            v0 = sc.nextDouble();
            
            if (v0 <= 0) {
                System.out.println("La velocidad inicial debe ser mayor a 0.\n");
            } else {
                
                System.out.print("Ingrese el angulo de lanzamiento (1 a 89 grados): ");
                angulo = sc.nextDouble();
                
                if (angulo < 1 || angulo > 89) {
                    System.out.println("El angulo debe estar estrictamente entre 1 y 89 grados.\n");
                } else {

                    datosValidos = true; 
                }
            }
        } while (!datosValidos);
        

        double anguloRad = Math.toRadians(angulo);
        double gravedad = 9.81; 
        
        double maxAltura = -1;
        int segundoMax = 0;
        boolean picoMostrado = false;
        
        System.out.println("\nIniciando simulacion");
        

        for (int t = 1; t <= 10; t++) {
            

            double altura = (v0 * Math.sin(anguloRad) * t) - (0.5 * gravedad * t * t);
            

            if (altura < 0) {
                System.out.println("impacto! La altura es negativa. El proyectil toco el suelo en el segundo " + t + ".");
                break; 
                
            } else {
                
                System.out.printf("Segundo %d: Altura = %.2f metros\n", t, altura);
                

                if (altura > maxAltura) {

                    maxAltura = altura;
                    segundoMax = t;
                } else {
                    
                    if (!picoMostrado) {
                        System.out.println("El proyectil alcanzo su altura maxima estimada en el segundo " + segundoMax + " ");
                        picoMostrado = true; 
                }
            }
        }
        
        System.out.println("\nFin de la simulacion.");
    }
        
    }
}
