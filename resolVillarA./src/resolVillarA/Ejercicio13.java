package resolVillarA;
public class Ejercicio13 {
    public static void ejercicio13(){

        String[] nombres = {"Juan", "María", "Pedro", "Ana"};//variable de los nombres de los estudiantes.
        double [][] calificaciones = {//variable double de las calificaciones de los estudiantes.
            {7.5, 8.0, 6.5},
            {9.0, 8.5, 7.0},
            {6.0, 7.5, 8.0}
        };
        for (int i = 0; i <nombres.length; i++){//primer for para recorrer el arreglo de los nombres.
            double suma = 0;//este double suma se usa para alacenar la suma de las calificaciones de cada estudiante.
            for (int j=0; j < calificaciones[i].length; j++){//este segundo for se encarga de recorrer las calificaciones de cada estudiante y sumarlas.
                suma += calificaciones[i][j];
            }
            System.out.println("Promedio de " + nombres[i] + ": " + (suma / calificaciones[i].length));//resultados impresos.
        }
    }
}
