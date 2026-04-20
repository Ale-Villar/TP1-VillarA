package resolVillarA;
import java.util.Scanner;
public class Ejercicio1{
    public static void ejercicio1(){
        //Mensaje de bienvenida al usario.
        Scanner saludo = new Scanner(System.in);
        //Peticion del ingreso del nombre del usuario
        System.out.println("Ingrese su nombre: ");
        String nombre = saludo.nextLine();
        //Resultado del saludo.
        System.out.println("Bienvenido " + nombre + ", ¿como estas?");
        saludo.close();
    }
}
