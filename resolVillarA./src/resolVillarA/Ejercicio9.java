package resolVillarA;
import java.util.Scanner;
public class Ejercicio9 {
    public static void ejercicio9(){
        Scanner scanner = new Scanner(System.in);
        //El sistema pide un texto al usuario
        System.out.println("Ingrese un Texto: ");
        String texto = scanner.nextLine();
        //Uso una bariable split para separar el texto en palabras.
        String[] palabras = texto.split("[^a-zA-Z0-9]+");//El regex utilizado valida que se separen las palabras 
        // por cualquier caracter que no sea una letra o un numero.
        int contador = 0;
        //Uso un ciclo for para recorrer el array de palabras y contar cuantas palabras hay en el texto.
        for (String palabra : palabras){
            if(!palabra.isEmpty()){
                contador++;
            }
        }
        //El sistema muestra el numero de palabras en el texto.
        System.out.println("El número de palabras en el texto es: " + contador);
        scanner.close();
    }
}
