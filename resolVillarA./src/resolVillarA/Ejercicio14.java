package resolVillarA;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio14 {

    public static void ejercicio14() {

        int[][] matriz = {
            {1, 2, 0, 3, 0, 7},
            {0, 0, 0, 0},
            {0, 6, 9, 8, 0, 9, 6},
            {0, 0, 0, 0, 7, 9, 0, 0},
            {0, 0, 0, 0, 0},
            {8, 7, 0, 8, 9, 0, 8}

        };

        System.out.println("Matriz original:");
        mostrar(matriz);

        List<int[]> nuevaLista = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {

            List<Integer> filaSinCeros = new ArrayList<>();

            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != 0) {
                    filaSinCeros.add(matriz[i][j]);
                }
            }

            // Si la fila NO quedó vacía, la agregamos
            if (!filaSinCeros.isEmpty()) {
                int[] nuevaFila = new int[filaSinCeros.size()];

                for (int k = 0; k < filaSinCeros.size(); k++) {
                    nuevaFila[k] = filaSinCeros.get(k);
                }

                nuevaLista.add(nuevaFila);
            }
        }

        // Convertimos a matriz
        int[][] resultado = new int[nuevaLista.size()][];

        for (int i = 0; i < nuevaLista.size(); i++) {
            resultado[i] = nuevaLista.get(i);
        }

        System.out.println("\nMatriz sin ceros:");
        mostrar(resultado);
    }

    public static void mostrar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}