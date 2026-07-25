/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola_mundo;

/**
 *
 * @author Ricardo Ortez
 */
public class Hola_Mundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Comentario solamente de una sola linea
        /*
        
        Bloque de comentario, me sirve para comentar varias lineas como un bloque y no llenar
        de plecas todo el tiempo. :)
        */
        
        //Como usar printline. Solamente escribe el texto y seguido a esto hace un enter
        System.out.println("Hola, soy Ricardo");
        System.out.println("Ese viene siendo mi primer");
        System.out.println("programa. :)");
        System.out.println("jeje");
        System.out.println("");
        
        //Como usar print normal. Solamente escribe y no hace enter, escribe todo pegado si no hay espacios.
        System.out.print("Voy en camino a ");
        System.out.print("la clase de progra ");
        System.out.print("con to' :)");
        System.out.println("");
        System.out.println("");
        
        //Como usar printf
        /*
        El %s sirve para colocar un texto en esa posicion. si la s es miniscula los caracteres vendrian siendo miniscula
        Si la S esta en mayuscula este viene siendo mayusculas. Que texto o valor? Vendria siendo el texto que sigue despues de la coma
        pero siempre dentro del parentesis.
        
        %s es para cadena (caracteres)
        %d es para entero (numeros sin decimales)
        %f es double (numeros con decimales)
        %c es para caracteres (uno solo, no dos ni mas)
        
        */
        System.out.printf("Mi apellido es %s \n", "Ortez");
        System.out.printf("%s Tu apellido es \n", "Rodriguez");
        System.out.printf("Tu apellido es %s es \n", "Ortez");
        System.out.println("");
        
        // \t es para hacer un espacio de tabulacion
        // \n es para hacer un enter sin necesidad de escribir un sout debajo de cada texto
        System.out.println("Hola \t este es \t un nuevo \t texto");
        System.out.println("Hola\neste es\nun nuevo\ntexto \n");
        
        
        //Variables
        int edad; //Tipo numero entero
        double peso; //Tipo numero con decimales
        char inicial; //Tipo caracteres de todo tipo
        String nombre;
        boolean estado; //Tipo estado (si o no, 1 o 0, true o false)
        
        edad = 19;
        peso = 70.5;
        inicial = 'R';
        nombre = "Richard";
        estado = true;
        
        System.out.printf("Tengo %d anios\n", edad);
        System.out.printf("Mi peso ideal es de %.2f kg\n", peso);
        System.out.printf("Dime %c por mi inicial\n", inicial);
        System.out.printf("%s es mi nombre\n", nombre);
        
        
    } 
    
}

/* 
El martillo hace guardar todos los archivos pero se asegura de que este todo sin errores de sintaxis.

 El martillo con escoba directamente es un reinicio de fabrica y no lee los datos que se cambiaron en todos los archivo sino que lee
 todo desde 0.

 Al darle a guardar lo guarda sin revisar el archivo y lo guarda con todo y errores.
*/