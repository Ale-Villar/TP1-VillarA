import java.util.Scanner;
public class Ejercicio4 {
    public static void ejercicio4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra: ");
        String palabra = scanner.nextLine();

        int num_volcal = 0;

        int num_caracteres = palabra.length();

        for (int i = 0; i < num_caracteres; i++) {
            char letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                num_volcal++;
            }
        }

        System.out.println("La cantidad de vocales en la palabra es: " + num_volcal);

        scanner.close();
    }
    
}
