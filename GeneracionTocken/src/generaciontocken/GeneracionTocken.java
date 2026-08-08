package generaciontocken;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Ricardo Ortez
 */
public class GeneracionTocken {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        Random RD = new Random();
        
        
        boolean longitudCorrecta = true;
        boolean prefijoCorrecto = true;
        boolean validacionCorrecta = true;
        int tipoCaracter = 0;
        int numeroToken = 0;
        char letraToken = 'a';
        String token = "a";
        
        String nombreEquipo = "a";
        

        
        do {
            
        System.out.println("Ingrese el nombre de su equipo");
        nombreEquipo = sc.nextLine().toUpperCase();
        
        System.out.printf("\nNombre del equipo: %s\n", nombreEquipo);
        
        //
        //
        longitudCorrecta = nombreEquipo.length() == 8;
        prefijoCorrecto = nombreEquipo.startsWith("RT") || 
                nombreEquipo.startsWith("SW");
        
        //System.out.println(longitudCorrecta);
        //System.out.println(prefijoCorrecto);
        
        validacionCorrecta = longitudCorrecta && prefijoCorrecto;
            //El signo de exlamacion funcion para que haga lo opuesto
        } while(!validacionCorrecta); // Se va a ejecutar al emnos una vez. No importa si es true or false
        System.out.println("Registro correcto.");
        
        while (token.length()<12) {
            
            tipoCaracter = RD.nextInt(2);
            
            if (tipoCaracter == 0){
                numeroToken = RD.nextInt(10);
                token = token + numeroToken;
                
            }
            else {
                
                letraToken = (char)(RD.nextInt(26)+65);
                token = token + letraToken;
            }
        }
        
        System.out.printf("Token es: %s", token);
    } // Fin de main
    
} // Fin de class
