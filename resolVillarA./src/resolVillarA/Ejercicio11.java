package resolVillarA;
import java.util.Scanner;
public class Ejercicio11 {
    public static void ejercicio11(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");//el sistema pide que número de la sucesión que se desea calcular.

        int n = scanner.nextInt();//se almacena el número ingresado por el usuario en la variable n.
        System.out.println("El término " + n + " de la sucesión de Fibonacci es: " + fibonacci(n));

        //el for imprimme los terminos desde el 0 hasta el n mediante la función fibonacci.
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        scanner.close();
    }
    //el static int contiene la funcion para calcular el término n en la sucesión Fibonacci.
    public static int fibonacci(int n) {
        //este caso se usa la Recursividad para el calculo de los términos.
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    } 
}
