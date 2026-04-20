package resolVillarA;
import java.util.Scanner;
public class Ejercicio5 {
    public static void  ejercicio5(){
        Scanner scanner = new Scanner(System.in);
        //El sistema pide una palabra al usuario
        System.out.println("Ingrese la palabra:");
        String palabra = scanner.nextLine();

        //Esta variable almacena la palabra al reves, utilizando el metodo reverse de StringBuilder.
        String palabraReversa = new StringBuilder(palabra).reverse().toString();

        //Condicional if para comparar la palabra original con la palabra al reves, utilizando el metodo equals de String.
        if(palabraReversa.equals(palabra)){
            System.out.println("La palabra es un palindromo");
        }else{
            System.out.println("La palabra no es un palindromo");
        }

        scanner.close();
    }
    
}
