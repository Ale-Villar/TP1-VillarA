package resolVillarA;
import java.util.Scanner;
public class Ejercicio3 {
    public static void ejercicio3(){
        Scanner scanner = new Scanner(System.in);
        //El sistema pide un numero para multiplicar.
        System.out.println("Ingresar numero: ");
        int numero = scanner.nextInt();
        
        int contador = 1, resultado;
        
        //el sistema muestra la tabla de multiplicar del numero ingresado, desde el 1 al 10.
        while(contador <= 10){
            resultado = numero * contador;
            System.out.println(numero + "x" + contador + "=" + resultado);
            contador++;
        }
        
        scanner.close();
    }
}
