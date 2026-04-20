package resolVillarA;
import java.util.Scanner;
public class Ejercicio2 {
    public static void ejercicio2() {
         Scanner scanner = new Scanner (System.in);
         //El sistema pide un numero al usario.
        System.out.println("Ingresar numero: ");
        int numero = scanner.nextInt();
        
        //Condicion para determinar si el numero es par o impar
        if (numero % 2 ==0){
            System.out.println("El numero es par");
        
        }else{
            System.out.println("El numero es impar");
        }
        scanner.close();
    }
}
