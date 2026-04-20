package resolVillarA;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio6 {
    public static void  ejercicio6(){
        Scanner scanner = new Scanner(System.in);
        //El sistema pide al usuario que ingrese un número entre 1 y 100. El sistema genera un número aleatorio entre 1 y 100.
        System.out.println("Ingrese un numero entre 1 y 100:");

        //La variable Rabdom permite generar un numero aleatorio entre 1 y 100, el cual se almacena en la variable numero.
        Random random = new Random();
        int numero = random.nextInt(100)+1;
        //Condicional que perimite al sistema comparar el numero ingresado por el usuario con el numero generado aleatoriamente.
        while (true){
            int intento = scanner.nextInt();
            if (intento < numero){//El sitema indica que el numero es menor al numero generado.
                System.out.println("El numero es mayor");
            } else if (intento > numero){//El sistema indica que el numero es mayor al numero generado.
                System.out.println("El numero es menor");
            } else {//El sistema indica que el numero ingresado por el usuario es igual al numero generado.
                System.out.println("Felicitaciones, adivinaste el numero!");
                break;
            }
        }
        scanner.close();
    }
    
}
