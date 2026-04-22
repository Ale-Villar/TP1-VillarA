package resolVillarA;
import java.util.Scanner;
public class Ejercicio10 {
    public static void ejercicio10(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una contraseña que tenga 8 caracreres, una letra mayúscula, una letra minúscula, un número y un caracter especial: ");
        String contraseña = scanner.nextLine();
        
        //El sistema valida que la contraseña cumpla con los requisitos de seguridad.
        if (contraseña.length()>=8){
            boolean mayuscula = false;
            boolean minuscula = false;
            boolean numero = false;
            boolean carcaterEspecial = false;
            //El for recorre cada caracter de la contraseña y verifica si es mayúscula, minúscula, número o caracter especial.
            for (int i = 0; i < contraseña.length(); i++){
                char c = contraseña.charAt(i);
                if (Character.isUpperCase(c)) {
                    mayuscula = true;
                } else if (Character.isLowerCase(c)) {
                    minuscula = true;
                } else if (Character.isDigit(c)){
                    numero = true;
                } else {
                    carcaterEspecial = true;
                }
            }
        //El segundo if verifica si la contraseña cumple con todos los requisitos.
        if ( mayuscula && minuscula && numero && carcaterEspecial){
            System.out.println("La contraseña es segura");
        } else {
            System.out.println("La contraseña no es segura");
        }
        };
            
    }
}
