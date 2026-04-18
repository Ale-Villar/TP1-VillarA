import java.util.Scanner;
public class Ejercicio3 {
    public static void ejercicio3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar numero: ");
        int numero = scanner.nextInt();
        
        int contador = 1, resultado;

        while(contador <= 10){
            resultado = numero * contador;
            System.out.println(numero + "x" + contador + "=" + resultado);
            contador++;
        }
        
        scanner.close();
    }
}
