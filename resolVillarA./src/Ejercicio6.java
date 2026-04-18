import java.util.Random;
import java.util.Scanner;
public class Ejercicio6 {
    public static void  ejercicio6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 100:");
        Random random = new Random();
        int numero = random.nextInt(100)+1;

        while (true){
            int intento = scanner.nextInt();
            if (intento < numero){
                System.out.println("El numero es mayor");
            } else if (intento > numero){
                System.out.println("El numero es menor");
            } else {
                System.out.println("Felicitaciones, adivinaste el numero!");
                break;
            }
        }
        scanner.close();
    }
    
}
