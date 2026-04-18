import java.util.Scanner;
public class Ejercicio2 {
    public static void ejercicio2() {
         Scanner scanner = new Scanner (System.in);
        System.out.println("Ingresar numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 ==0){
            System.out.println("El numero es par");
        
        }else{
            System.out.println("El numero es impar");
        }
        scanner.close();
    }
}
