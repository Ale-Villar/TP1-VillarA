import java.util.Scanner;
public class Ejercicio7 {
    public static void ejercicio7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija una opciòn: ");
        System.out.println("1. Sumar dos nùmeros");
        System.out.println("2. Restar dos nùmeros");
        System.out.println("3. Multiplicar dos nùmeros");
        System.out.println("4. Dividir dos nùmeros");
        System.out.println("5. Salir");
        int numero = scanner.nextInt();

        switch(numero){
            case 1:
                System.out.println("Ingrese el primer nùmero: ");
                int num1 = scanner.nextInt();
                System.out.println("Ingrese el segundo nùmero: ");
                int num2 = scanner.nextInt();
                int suma = num1 + num2;
                System.out.println("La suma es: " + suma);
                break;
            case 2:
                System.out.println("Ingrese el primer nùmero: ");
                int num3 = scanner.nextInt();
                System.out.println("Ingrese el segundo nùmero: ");
                int num4 = scanner.nextInt();
                int resta = num3 - num4;
                System.out.println("La resta es: " + resta);
                break;
            case 3:
                System.out.println("Ingrese el primer nùmero: ");
                int num5 = scanner.nextInt();
                System.out.println("Ingrese el segundo nùmero: ");
                int num6 = scanner.nextInt();
                int multiplicacion = num5 * num6;
                System.out.println("La multiplicaciòn es: " + multiplicacion);
                break;
            case 4:
                System.out.println("Ingrese el primer nùmero: ");
                int num7 = scanner.nextInt();
                System.out.println("Ingrese el segundo nùmero: ");
                int num8 = scanner.nextInt();
                if (num8 != 0) {
                    double division = (double) num7 / num8;
                    System.out.println("La divisiòn es: " + division);
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opciòn no válida. Por favor, ingrese un número entre 1 y 5.");
        }

        scanner.close();
    }
}
