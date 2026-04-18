import java.util.Scanner;
public class Ejercicio1{
    public static void ejercicio1(){
        Scanner saludo = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = saludo.nextLine();
        System.out.println("Bienvenido " + nombre + ", ¿como estas?");
        saludo.close();
    }
}
