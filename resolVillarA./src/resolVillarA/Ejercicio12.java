package resolVillarA;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Ejercicio12 {
    public static void ejercicio12(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cantidad de números enteros:"); //el sistema pide la cantidad de enteros.

        int numero = scanner.nextInt();//ya ingresada la cantidad la variable numero almacena ese valor.

        List<Integer> lista = new ArrayList<>();// con el List<Interger> crea la lista y con rl new ArrayList<>() la inicializa.
        
        for(int i = 0; i < numero; i++){//el for se encarga de pedir los números enteros y almacenarlos en la lista.
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            lista.add(scanner.nextInt());
        }
        java.util.Collections.sort(lista); //con el Collections.sort(lista) se ordena la lista de menor a mayor.
        System.out.println("Números ordenados de menor a mayor: "+ lista);//el sistema imprime la lista ordenada.
        scanner.close();
        }
    }
