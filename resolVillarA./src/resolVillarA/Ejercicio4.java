package resolVillarA;
import java.util.Scanner;
public class Ejercicio4 {
    public static void ejercicio4(){
        Scanner scanner = new Scanner(System.in);
        //El sistema solicita al usuario ingresar una palabra
        System.out.println("Ingrese la palabra: ");
        String palabra = scanner.nextLine();

        //el sistema cuenta la cantidad de vocales que tiene la palabra
        
        int num_volcal = 0; //contador de vocales
        int num_caracteres = palabra.length();//longitud de la palabra

        //Condicional para contar la cantidad de vocales que tiene la palabra
        for (int i = 0; i < num_caracteres; i++) {
            char letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                num_volcal++;
            }
        }
        //Mensaje que muestra la cantidad de vocales que tiene la palabra
        System.out.println("La cantidad de vocales en la palabra es: " + num_volcal);

        scanner.close();
    }
    
}
