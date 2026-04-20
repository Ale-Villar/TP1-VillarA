package resolVillarA;
import java.util.Scanner;
public class Ejercicio8 {
    public static void ejercicio8(){
      Scanner scanner = new Scanner(System.in);
        // Pedir al usuario la temperatura y las unidades de origen y destino
        System.out.println("Temperatura que decea convertir: ");
        double temperatura = scanner.nextDouble();
        //Opcion de Celsius a Fahrenheit 
        System.out.println("Seleccione la unidad de origen: ");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        int unidadOrigen = scanner.nextInt();
        //Opcion de Fahrenheit a Celsius
        System.out.println("Seleccione la unidad de destino: ");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        int unidadDestino = scanner.nextInt();
        double resultado = 0.0;

        //Condicion para convertir la temperatura
        if (unidadOrigen == 1 && unidadDestino == 2) {
            temperatura = (temperatura * 9/5) + 32;
            resultado = temperatura;
        } else if (unidadOrigen == 2 && unidadDestino == 1){
            temperatura = (temperatura - 32) * 5/9;
            resultado = temperatura;
        } else {
            System.out.println("Medidas no válidas");
        }
        //Resultado del cambio de Temperaturas.
        System.out.println("El resultado es: " + resultado);
        scanner.close();
    } 
}
