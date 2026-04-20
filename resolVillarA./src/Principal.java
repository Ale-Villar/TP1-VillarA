import java.util.Scanner;
import resolVillarA.*;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que ejercicio desea ejecutar? (1-14)");
        int ejercicio = scanner.nextInt();
        
        switch (ejercicio) {
            case 1:
                Ejercicio1.ejercicio1();
                break;
            case 2:
                Ejercicio2.ejercicio2();
                break;
            case 3:
                Ejercicio3.ejercicio3();
                break;
            case 4:
                Ejercicio4.ejercicio4();
                break;
            case 5:
                Ejercicio5.ejercicio5();
                break;
            case 6:
                Ejercicio6.ejercicio6();
                break;
            case 7:
                Ejercicio7.ejercicio7();
                break;
            case 8:
                Ejercicio8.ejercicio8();
                break;
            case 9:
                Ejercicio9.ejercicio9();
                break;
            case 10:
                Ejercicio10.ejercicio10();
                break;
            case 11:
                Ejercicio11.ejercicio11();
                break;
            case 12:
                Ejercicio12.ejercicio12();
                break;
            case 13:
                Ejercicio13.ejercicio13();
                break;
            case 14:
                Ejercicio14.ejercicio14();
                break;
            default:
                System.out.println("Ejercicio no válido. Por favor, ingrese un número entre 1 y 14.");
        }
        scanner.close();
    }
}
