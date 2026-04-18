import java.util.Scanner;
public class Ejercicio5 {
    public static void  ejercicio5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra:");
        String palabra = scanner.nextLine();


        String palabraReversa = new StringBuilder(palabra).reverse().toString();

        if(palabraReversa.equals(palabra)){
            System.out.println("La palabra es un palindromo");
        }else{
            System.out.println("La palabra no es un palindromo");
        }

        scanner.close();
    }
    
}
